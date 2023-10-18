package fileRepository;

class ProjectDataHandler {
    private DataRepository repository; // The reference is an abstraction, not a concrete class.

    public ProjectDataHandler(DataRepository repository) {
        this.repository = repository; // Dependency is injected rather than directly instantiated.
    }

    public void saveData(String data) {
        repository.save(data);
    }
}
