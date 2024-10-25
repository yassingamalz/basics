package basics.basics.collections.sets;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * The {@code Project} class represents a project with a specified start and end date,
 * and a collection of tasks associated with it.
 *
 * <p>Projects can contain multiple tasks, and tasks may belong to only one project.
 * The class provides methods to add and remove tasks, ensuring a two-way association.
 *
 * <p>Example usage:
 * <pre>
 *     Project project = new Project("Website Development", LocalDate.now(), LocalDate.of(2023, 12, 31));
 *     Task task = new Task("Develop homepage", 20);
 *     project.addTask(task);
 * </pre>
 *
 * @see Task
 * @see Employee
 */
class Project {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<Task> tasks;

    public Project(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = new HashSet<>();
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * Adds a task to the project. Ensures the task is linked to this project.
     *
     * @param task the task to add
     */
    public void addTask(Task task) {
        tasks.add(task);
        if (task.getProject() != this) task.setProject(this);
    }

    /**
     * Removes a task from the project, severing the association with this project.
     *
     * @param task the task to remove
     */
    public void removeTask(Task task) {
        tasks.remove(task);
        task.setProject(null);
    }

    // equals, hashCode, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) &&
                Objects.equals(startDate, project.startDate) &&
                Objects.equals(endDate, project.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Project{" + "name='" + name + '\'' + ", startDate=" + startDate + ", endDate=" + endDate + ", tasks=" + tasks + '}';
    }
}

/**
 * The {@code Task} class represents an individual task within a project,
 * associated with an employee who serves as a team leader.
 *
 * <p>Each task has a unique identifier (UUID), description, and estimated hours needed to complete it.
 */
class Task {
    private final UUID uuid;
    private String description;
    private Integer hoursNeeded;
    private Project project;
    private Employee teamLeader;

    public Task(String description, Integer hoursNeeded) {
        this.uuid = UUID.randomUUID();
        this.description = description;
        this.hoursNeeded = hoursNeeded;
    }

    // Getter and Setter methods
    public UUID getUuid() {
        return uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHoursNeeded() {
        return hoursNeeded;
    }

    public void setHoursNeeded(Integer hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        if (Objects.nonNull(this.project) && (this.project.getTasks().contains(this))) {
            this.project.removeTask(this);
        }
        if (Objects.nonNull(project)) {
            project.getTasks().add(this);
        }
        this.project = project;
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Employee teamLeader) {
        this.teamLeader = teamLeader;
    }

    // equals, hashCode, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return "Task{" + "uuid=" + uuid + ", description='" + description + '\'' + ", hoursNeeded=" + hoursNeeded + ", project=" + project + ", teamLeader=" + teamLeader + '}';
    }
}

/**
 * The {@code Employee} class represents an employee with identifying details,
 * such as name, last name, and social security code.
 *
 * <p>This class is used to represent team leaders of tasks in a project.
 */
class Employee {
    private String name;
    private String lastName;
    private String socialSecurityCode;

    public Employee(String name, String lastName, String socialSecurityCode) {
        this.name = name;
        this.lastName = lastName;
        this.socialSecurityCode = socialSecurityCode;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    // equals, hashCode, and toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(socialSecurityCode, employee.socialSecurityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, socialSecurityCode);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", socialSecurityCode='" + socialSecurityCode + '\'' + '}';
    }
}
