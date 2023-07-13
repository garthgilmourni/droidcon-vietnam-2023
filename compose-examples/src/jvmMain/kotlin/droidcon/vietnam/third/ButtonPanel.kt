package droidcon.vietnam.third

import androidx.compose.runtime.Composable

@Composable
fun ButtonPanel(viewModel: AppViewModel) {
    PaddedButton("Inc") {
        viewModel.increaseFont()
    }
    PaddedButton("Dec") {
        viewModel.decreaseFont()
    }
    PaddedButton("Change Color") {
        viewModel.switchColor()
    }
}