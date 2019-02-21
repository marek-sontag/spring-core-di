package pl.sda.spring.coredi;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.coredi.beans.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/services.xml"})
public class PhylosopherTest {
	private static final Logger logger = Logger.getLogger( PhylosopherTest.class.getName() );

	@Autowired
	private HeavyQuestion heavyQuestion;

	@Autowired
	@Qualifier("polish_philosopher")
	private Philosopher polishPhylosopher;

	@Autowired
	@Qualifier("russian_philosopher")
	private Philosopher russianPhylosopher;

	@Autowired
	private Car car;

	@Test
	public void testQuestion(){
		assertTrue(heavyQuestion.getQuestion().contains("Who knows"));
	}

	@Test
	public void testPhilosopoher(){
		logger.info( polishPhylosopher.getMostImportantQuestion().getQuestion() );
		assertNotNull(polishPhylosopher.getMostImportantQuestion());
	}

	@Test
	public void testPhilosophersQuestions(){
		HeavyQuestion russionQuestion = russianPhylosopher.getMostImportantQuestion();
		HeavyQuestion polishQuestion = polishPhylosopher.getMostImportantQuestion();
		assertEquals( russionQuestion, polishQuestion );
	}

	@Test
	public void testPhilosophersAttributes(){
		List<PhilosopherAttribute> attributes = polishPhylosopher.getAttributes();
		PhilosopherAttribute expected = new PhilosopherAttribute( 12, "ksiazka" );
		assertEquals( expected, attributes.get( 0 ));
	}

	@Test
	public void testRussionPhylospoherAttributes(){
		List<PhilosopherAttribute> attributes = russianPhylosopher.getAttributes();

		assertEquals(2, attributes.size());
	}

	@Test
	public void testCar(){
		String brand = car.getBrand();
		assertEquals("Skoda", brand);
	}

	@Test
	public void testCarEngine(){
		Engine engine = car.getEngine();
		assertEquals(1300, engine.getEngineVolume());
	}

}
