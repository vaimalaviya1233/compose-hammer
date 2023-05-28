package com.ivyapps.composematerial3helper.content

import com.ivyapps.composematerial3helper.domain.ContentScope
import com.ivyapps.composematerial3helper.domain.component
import com.ivyapps.composematerial3helper.domain.group

fun ContentScope.animations() = group(
    title = "(*) Animations",
    showInToolWindow = false
) {
    component {
        showInToolWindow = false
        name = "Visibility: fade-in/out + expand/collapse"
        imports = listOf(
            "androidx.compose.animation.AnimatedVisibility",
            "androidx.compose.animation.expandVertically",
            "androidx.compose.animation.fadeIn",
            "androidx.compose.animation.fadeOut",
            "androidx.compose.animation.shrinkVertically",
            "androidx.compose.runtime.Composable",
            "androidx.compose.runtime.getValue",
            "androidx.compose.runtime.mutableStateOf",
            "androidx.compose.runtime.remember",
            "androidx.compose.runtime.setValue",
            "androidx.compose.ui.Modifier",

            )
        code = """
            var visible by remember { mutableStateOf(false) }
            AnimatedVisibility(
                modifier = Modifier,
                visible = visible,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically(),
            ) {
        
            }
        """.trimIndent()
    }

    component {
        showInToolWindow = false
        name = "Crossfade"
        imports = listOf(
            "androidx.compose.animation.Crossfade",
            "androidx.compose.runtime.Composable",
            "androidx.compose.runtime.getValue",
            "androidx.compose.runtime.mutableStateOf",
            "androidx.compose.runtime.remember",
            "androidx.compose.runtime.setValue",

            )
        code = """
            var visible by remember { mutableStateOf(false) }
            Crossfade(
                targetState = visible,
                label = "crossfade content"
            ) { state ->
                when (state) {
                    true -> {
        
                    }
        
                    false -> {
        
                    }
                }
            }
        """.trimIndent()
    }

//    component {
//        showInToolWindow = false
//        name = "animateFloatAs"
//    }
}