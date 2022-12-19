public class Main {
    public static void main(String[] args) {
        var totalHoursNumber = 640;
        var hoursPerWorker = 8;
        var workersNumber = totalHoursNumber / hoursPerWorker;
        System.out.println("Всего работников в компании —  " + workersNumber + " человек.");
        workersNumber = workersNumber + 94;
        totalHoursNumber = workersNumber * hoursPerWorker;
        System.out.println("Если в компании работает  " + workersNumber + " человек, то всего " + totalHoursNumber + " часов работы может быть поделено между сотрудниками.");
    }
}