package dev.miguel.dtos;

public class EntryDTO {
    private String title;
    private String date;
    private String description;
    private int emotion;

    public EntryDTO(String title, String date, String description, int emotion) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.emotion = emotion;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getEmotion() {
        return emotion;
    }

    // Setters (opcional, por si luego quieres modificar valores)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmotion(int emotion) {
        this.emotion = emotion;
    }
}
