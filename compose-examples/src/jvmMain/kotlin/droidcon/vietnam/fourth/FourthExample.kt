package droidcon.vietnam.fourth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@Composable
fun FourthExample(client: WebSocketClient) {
    val confSessions = remember { mutableStateOf(emptyList<ConfSession>()) }
    val scope = rememberCoroutineScope()

    val fetchSessionsByDate: (String) -> Unit = { date ->
        scope.launch {
            if (date.isBlank()) {
                client.fetchAllSessions(confSessions)
            } else {
                client.fetchSessionsByDate(confSessions, date)
            }
        }
    }

    LaunchedEffect(Unit) {
        client.fetchAllSessions(confSessions)
    }

    Box(modifier = Modifier.padding(20.dp)) {
        Column {
            TitleBar()
            FetchByDateButtons(fetchSessionsByDate)
            ConfSessionsDisplay(confSessions!!.value)
        }
    }
}