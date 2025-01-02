import java.util.Scanner

fun displaywelcomemessage(){
    val welcomemessage = "Welcome to VKU!"
    println(welcomemessage)
}
fun userInfor(){
    val scanner = Scanner(System.`in`)

    println("Enter Student Name:")
    val name = scanner.nextLine()

    println("Enter Student Age:")
    val age = scanner.nextInt()

    println("Enter Stuedent GPA:")
    val gpa = scanner.next()

    println("Enter Student ID:")
    val id = scanner.next()

    println("\n--- Student Information ---")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
    println("ID: $id")
}
fun departmentDetails(): String {
    val departments = listOf("Department 1", "Department 2", "Department 3", "Department 4", "Department 5")

    // in list
    println("\n--- chosen department ---")
    println("Available Departments:")
    for ((index, department) in departments.withIndex()) {
        println("${index + 1}. $department")
    }

    //
    println("\nEnter the number of your chosen department:")
    val chon = readLine()?.toIntOrNull()


    return if (chon != null && chon in 1..departments.size) {
        println("You have chosen: ${departments[chon - 1]}")
        departments[chon - 1]
    } else {
        println("Invalid . Please try again.")
        departmentDetails()
    }
}
fun main() {
    displaywelcomemessage()
    userInfor()
    val chosen = departmentDetails()
    println("\nChosen Department: $chosen")
}