public enum Week {



    MONDAY("Duishombu kunu Java okuim"),
    TUESDAY("Sheyshembi kunu Practic lesson Java"),
    WEDNESDAY("Sharshembi kunu Technical lesson java"),
    THURSDAY("Beyshembi kunu practical lesson"),
    FRIDAY("juma kunu technical lesson bolot"),
    SATURDAY("Ishembi kunu sabak jok"),
    SUNDAY("Jekshembi kunu dem alysh");



    private String lessons;

    Week(String lessons) {
        this.lessons = lessons;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return " " +
                " " + lessons + '\'' +
                '.';
    }
}

