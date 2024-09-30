public class AmazingApp {
    

    public void savePost(String text) {
        // do stuff with a database

        notifyPeople();
    }

    private void notifyPeople() {
        for (Person p : ...) {
            Notification n = p.getPreferredNotificationMethod();
            n.sendMessage(xxxx, "New post to look at NOW!!!");
        }
    }
}
