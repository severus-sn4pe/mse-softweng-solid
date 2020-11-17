class DatabasePersistence implements InvoicePersistence {

	@Override
	public void save(Invoice invoice) {
		// Implement Data save logic
		System.out.println(invoice.book.name + " saved in DB.");
		System.out.println("\n");
	}
    
}