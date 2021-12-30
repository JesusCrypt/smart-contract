package heaven.jesuscrypt.smartcontract

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmartContractApplication

fun main(args: Array<String>) {
	runApplication<SmartContractApplication>(*args)
}
