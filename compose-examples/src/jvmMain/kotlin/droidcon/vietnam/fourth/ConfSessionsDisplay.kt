package droidcon.vietnam.fourth

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConfSessionsDisplay(gotoSessions: List<ConfSession>) {
    Row {
        LazyColumn(modifier = Modifier.height(400.dp)) {
            items(gotoSessions) { session ->
                ConfSessionRow(session)
            }
        }
    }
}