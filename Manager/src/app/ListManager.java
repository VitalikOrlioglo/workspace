package app;

public class ListManager {
    private ListDAO dao;
    
    public ListManager() {
        dao = ListDAOFactory.getContactDAO();
    }
    
    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }
    
    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }
    
    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }
    
    public Contact getContact(Long contactId) {
        return dao.getContact(contactId);
    }
    
    public List<Contact> findContacts() {
        return dao.findContacts();
    }
}
