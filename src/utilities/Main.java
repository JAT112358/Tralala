package utilities;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import entities.Account;
import entities.Address;
import entities.User;

public class Main {

	public static void main(String[] args)
	{
		User user1 = new User("jordan.aranda@me.com", "Jordan", "Aranda",
				"jordan.aranda@hotmail.com", "12345");

		Address address1 = new Address("Luis de castresana", "Barakaldo", "Vizcaya", "Spain", user1);

		user1.addAddress(address1);

		// Load Persistence Manager Factory
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("exampleJDO");
		// Persistence Manager
		PersistenceManager pm = null;
		// Transaction to group DB opertaions
		Transaction tx = null;

		try
		{
			System.out.println("- Store objects in the DB");
			// Get the Persistence Manager
			pm = pmf.getPersistenceManager();
			// Obtain the current transaction
			tx = pm.currentTransaction();
			// Start the transaction
			tx.begin();

			pm.makePersistent(user1);

			// End the transaction
			tx.commit();
			System.out.println("  * Objects has been stored!");
			System.out.println("- Transferring $100");
			System.out.println("    - " + user1.toString() + "\nDireccion: \n"
					+ address1.toString());
		} catch (Exception ex)
		{
			System.err.println(" $ Error storing objects in the DB: " + ex.getMessage());
			ex.printStackTrace();
		} finally
		{
			if (tx != null && tx.isActive())
			{
				tx.rollback();
			}

			if (pm != null && !pm.isClosed())
			{
				pm.close();
			}
		}

		try
		{
			System.out.println("- Retreiving all the accounts using an 'Extent'...");
			// Get the Persistence Manager
			pm = pmf.getPersistenceManager();
			// Obtain the current transaction
			tx = pm.currentTransaction();
			// Start the transaction
			tx.begin();

			Extent<Account> extent = pm.getExtent(Account.class, true);

			for (Account account : extent)
			{
				System.out.println("  -> " + account);
			}

			// End the transaction
			tx.commit();
		} catch (Exception ex)
		{
			System.err
					.println(" $ Error retreiving accounts using an 'Extent': " + ex.getMessage());
		} finally
		{
			if (tx != null && tx.isActive())
			{
				tx.rollback();
			}

			if (pm != null && !pm.isClosed())
			{
				pm.close();
			}
		}

		// try
		// {
		// System.out.println("- Retreiving accounts with balace > 200.0 using a 'Query'...");
		// // Get the Persistence Manager
		// pm = pmf.getPersistenceManager();
		// // Obtain the current transaction
		// tx = pm.currentTransaction();
		// // Start the transaction
		// tx.begin();
		//
		// Query query = pm.newQuery(Account.class);
		// query.setFilter("balance > 200.0");
		//
		// @SuppressWarnings("unchecked")
		// List<Account> accounts = (List<Account>) query.execute();
		//
		// for (Account account : accounts)
		// {
		// System.out.println("  -> " + account.getUser().getFullName() + " - "
		// + account.getBankName());
		// }
		//
		// // End the transaction
		// tx.commit();
		// } catch (Exception ex)
		// {
		// System.err.println(" $ Error retreiving accounts using a 'Query': " +
		// ex.getMessage());
		// } finally
		// {
		// if (tx != null && tx.isActive())
		// {
		// tx.rollback();
		// }
		//
		// if (pm != null && !pm.isClosed())
		// {
		// pm.close();
		// }
		// }

		// try
		// {
		// System.out.println("- Deleting 'User->Address' relation...");
		// // Get the Persistence Manager
		// pm = pmf.getPersistenceManager();
		// // Obtain the current transaction
		// tx = pm.currentTransaction();
		// // Start the transaction
		// tx.begin();
		//
		// Query query = pm.newQuery(User.class);
		// @SuppressWarnings("unchecked")
		// List<User> users = (List<User>) query.execute();
		//
		// for (User user : users)
		// {
		// System.out.println("  -> Retrieved user: " + user.getFullName());
		// System.out.println("     + Removing user from the addresses ... ");
		// user.removeUserFromAddresses();
		// }
		//
		// // End the transaction
		// tx.commit();
		// } catch (Exception ex)
		// {
		// System.err.println(" $ Error deleting 'User->Address' relation: " +
		// ex.getMessage());
		// } finally
		// {
		// if (tx != null && tx.isActive())
		// {
		// tx.rollback();
		// }
		//
		// if (pm != null && !pm.isClosed())
		// {
		// pm.close();
		// }
		// }
		//
		// try
		// {
		// System.out.println("- Cleaning the DB...");
		// // Get the Persistence Manager
		// pm = pmf.getPersistenceManager();
		// // Obtain the current transaction
		// tx = pm.currentTransaction();
		// // Start the transaction
		// tx.begin();
		//
		// // //Delete accounts from DB
		// // Query query1 = pm.newQuery(Account.class);
		// // System.out.println(" * '" + query1.deletePersistentAll() +
		// // "' accounts deleted from the DB.");
		// // //Delete users from DB
		// // Query query2 = pm.newQuery(User.class);
		// // System.out.println(" * '" + query2.deletePersistentAll() +
		// // "' users deleted from the DB.");
		// // //Delete addresses from DB
		// // Query query3 = pm.newQuery(Address.class);
		// // System.out.println(" * '" + query3.deletePersistentAll() +
		// // "' addresses deleted from the DB.");
		//
		// // End the transaction
		// tx.commit();
		// } catch (Exception ex)
		// {
		// System.err.println(" $ Error cleaning the DB: " + ex.getMessage());
		// ex.printStackTrace();
		// } finally
		// {
		// if (tx != null && tx.isActive())
		// {
		// tx.rollback();
		// }
		//
		// if (pm != null && !pm.isClosed())
		// {
		// pm.close();
		// }
		// }

		System.out.println("End of the Datanucleus + JDO example");
		System.out.println("====================================");
	}
}
