class DatabasePersistence implements InvoicePersistence {

	@Override
	public void save(Invoice invoice) {
		// Implement Data save logic
		System.out.print(invoice.book.name + " saved in DB");
	}
    
}