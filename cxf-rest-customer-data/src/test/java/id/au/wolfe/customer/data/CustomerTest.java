package id.au.wolfe.customer.data;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 */
@ContextConfiguration(locations = {"/test-application-context.xml"})
public class CustomerTest extends AbstractJUnit4SpringContextTests {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testShouldSaveValidCustomer() {
        logger.info("loaded.");

        entityManager.createQuery("select c from Customer c");
    }
}
