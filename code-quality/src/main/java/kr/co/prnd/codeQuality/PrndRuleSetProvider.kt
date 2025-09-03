package kr.co.prnd.codeQuality

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class PrndRuleSetProvider : RuleSetProvider {
    override val ruleSetId: String = "prnd"

    override fun instance(config: Config): RuleSet {
        return RuleSet(
            ruleSetId,
            listOf(
                NoPrintln(config)
            ),
        )
    }
}
