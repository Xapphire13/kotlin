// !DIAGNOSTICS: -UNUSED_EXPRESSION
// SKIP_TXT

// TESTCASE NUMBER: 1
fun case_1(value_1: Boolean): String = when(value_1) {
    true -> ""
}

// TESTCASE NUMBER: 2
fun case_2(value_1: Boolean): String = when(value_1) {
    false -> ""
}

// TESTCASE NUMBER: 3
fun case_3(value_1: Boolean): Int = when(value_1) { }

// TESTCASE NUMBER: 4
fun case_4(value_1: Boolean): String = when {
    value_1 == true -> ""
    value_1 == false -> ""
}

/*
 * TESTCASE NUMBER: 5
 * DISCUSSION: maybe use const propagation here?
 * ISSUES: KT-25265
 */
fun case_5(value_1: Boolean): String {
    val trueValue = true
    val falseValue = false

    return when (value_1) {
        trueValue -> ""
        falseValue -> ""
    }
}
