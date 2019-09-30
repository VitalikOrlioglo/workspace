package app;

public class PersonnelManager {
    private PersonnelDAO dao;
    
    public PersonnelManager() {
        dao = PersonnelDAOFactory.getContactDAO();
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
    
    public Personnel<Contact> findContacts() {
        return dao.findContacts();
    }
}
