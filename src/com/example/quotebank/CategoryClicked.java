package com.example.quotebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;


    public class CategoryClicked extends ListActivity {
    	private static final int REQUEST_CODE =10;
    	
    	String[] birthday = new String[] {"" +
    			"God gave us the gift of life; it is up to us to give ourselves the gift of living well. ~Voltaire"
    			, "The greatest gift that you can give to others is the gift of unconditional love and acceptance. ~Brian Tracy"
    			,"I think, at a child's birth, if a mother could ask a fairy godmother to endow it with the most useful gift, that gift should be curiosity. ~Eleanor Roosevelt"
    			,"Every year on your birthday, you get a chance to start new. ~Sammy Hagar",
    			"How old would you be if you didn't know how old you are? ~Satchel Paige ",
    			"All the world is birthday cake, so take a piece, but not too much. ~George Harrison",
    			"I remember when the candle shop burned down. Everyone stood around singing 'Happy Birthday.' ~Steven Wright",
    			"You know you're getting old when you get that one candle on the cake. It's like, 'See if you can blow this out.' ~Jerry Seinfeld"
    			,"The way I see it, you should live everyday like its your birthday. ~Paris Hilton"
    			,"It takes a long time to become young. ~Pablo Picasso"
    			};
    	String[] friendship = new String[] {
    			"Friendship is born at that moment when one man says to another: \"What! You too? I thought that no one but myself . . .\" ~C.S. Lewis", 
    			"Don't walk behind me; I may not lead. Don't walk in front of me; I may not follow. Just walk beside me and be my friend. ~Albert Camus", 
    			"A friend is someone who knows all about you and still loves you. ~Elbert Hubbard", 
    			"Good friends, good books, and a sleepy conscience: this is the ideal life. ~Mark Twain", 
    			"It is not a lack of love, but a lack of friendship that makes unhappy marriages. ~Friedrich Nietzsche", 
    			"The truth is, everyone is going to hurt you. You just got to find the ones worth suffering for. ~Bob Marely", 
    			"If I had a flower for every time I thought of you...I could walk through my garden forever. ~Alfred Lord Tennyson", 
    			"There is nothing I would not do for those who are really my friends. I have no notion of loving people by halves, it is not my nature. ~Jane Austen", 
    			"When someone loves you, the way they say your name is different. You know that your name is safe in their mouth. ~Jess C. Scott"
    			,"It's the friends you can call up at 4 a.m. that matter. ~Marlene Dietrich"
    			};
    	String[] love = new String[] {
    			"Keep love in your heart. A life without it is like a sunless garden when the flowers are dead. ~Oscar Wilde"
    			, "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage. ~Lao Tzu"    		
    			, "Love is composed of a single soul inhabiting two bodies. ~Aristotle"
    			, "I have decided to stick with love. Hate is too great a burden to bear. ~Martin Luther King, Jr."
    			, "Immature love says: 'I love you because I need you.' Mature love says 'I need you because I love you.' ~Erich Fromm"
    			, "Where there is love there is life. ~Mahatma Gandhi"
    			, "Affection is responsible for nine-tenths of whatever solid and durable happiness there is in our lives. ~C.S. Lewis"
    			, "A loving heart is the beginning of all knowledge. ~Thomas Carlyle"
    			,"We're born alone, we live alone, we die alone. Only through our love and friendship can we create the illusion for the moment that we're not alone. ~Orson Welles"
    			};
    	String[] music = new String[] {
    			"One good thing about music, when it hits you, you feel no pain. ~Bob Marley"
    			,"Music is a moral law. It gives soul to the universe, wings to the mind, flight to the imagination, and charm and gaiety to life and to everything. ~Plato"
    			,"Without music, life would be a mistake.","If music be the food of love, play on. ~William Shakespeare"
    			,"Music was my refuge. I could crawl into the space between the notes and curl my back to loneliness. ~Maya Angelou"
    			,"Music doesn't lie. If there is something to be changed in this world, then it can only happen through music. ~Jimi Hendrix"
    			,"After silence, that which comes nearest to expressing the inexpressible is music. ~Aldous Huxley"
    			,"Music is everybody's possession. It's only publishers who think that people own it. ~John Lennon"
    			,"For me, singing sad songs often has a way of healing a situation. It gets the hurt out in the open into the light, out of the darkness. ~Reba McEntire"
    			,"In music the passions enjoy themselves. ~Friedrich Nietzsche"
    			};
    	String[] christmas = new String[] {
    			"The main reason Santa is so jolly is because he knows where all the bad girls live. ~George Carlin"
    			, "Christmas, my child, is love in action. Every time we love, every time we give, it's Christmas. ~Dale Evans Rogers"
    			,"Maybe Christmas, the Grinch thought, doesn't come from a store. ~Dr. Seuss"
    			,"A good conscience is a continual Christmas. ~Benjamin Franklin"
    			,"I will honor Christmas in my heart, and try to keep it all the year. ~ Charles Dickens"
    			,"Christmas... is not an external event at all, but a piece of one's home that one carries in one's heart. ~Freya Stark"
    			,"Christmas isn't a season. It's a feeling. ~Edna Ferber"
    			,"If you haven't got any charity in your heart, you have the worst kind of heart trouble. ~Bob Hope"
    			,"I once wanted to become an atheist, but I gave up - they have no holidays. ~Henny Youngman"
    			,"Expectancy is the atmosphere for miracles. ~Edwin Louis Cole"
    			};
    	String[] graduation = new String[] {
    			"A graduation ceremony is an event where the commencement speaker tells thousands of students dressed in identical caps and gowns that \"individuality\" is the key to success. ~Robert Orben"
    			,"Just about a month from now I'm set adrift, with a diploma for a sail and lots of nerve for oars. ~Richard Halliburton"
    			,"There is a good reason they call these ceremonies \"commencement exercises.\"  Graduation is not the end; it's the beginning. ~Orrin Hatch"
    			,"The fireworks begin today.  Each diploma is a lighted match.  Each one of you is a fuse. ~Ed Koch"
    			,"All that stands between the graduate and the top of the ladder is the ladder. ~Unknown"
    			,"At commencement you wear your square-shaped mortarboards.  My hope is that from time to time you will let your minds be bold, and wear sombreros. ~Paul Freund"
    			,"When you leave here, don't forget why you came. ~Adlai E. Stevenson"
    			,"Graduation day is tough for adults.  They go to the ceremony as parents.  They come home as contemporaries.  After twenty-two years of child-raising, they are unemployed. ~Erma Bombeck"
    			,"An investment in knowledge always pays the best interest. ~Benjamin Franklin"
    			};

    	private ArrayAdapter<String> listAdapter ; 
    	
    	@Override	
    	protected void onCreate(Bundle savedInstanceState) {
    		   super.onCreate(savedInstanceState);    
    		      
    		    ArrayList<String> quoteList = new ArrayList<String>();
    		    
        		Bundle extras = getIntent().getExtras();
        		
        		if(extras==null){
        			return;
        		}
        		String category =extras.getString("category");
        		
        		if(category.equals("birthday")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, birthday);  	 
        		}
        		else if(category.equals("friendship")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, friendship); 
        		    }
        		else if(category.equals("love")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, love);
        		    }
        		else if(category.equals("music")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, music); 
        		    }
        		else if(category.equals("christmas")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, christmas); 
        		    }
        		else if(category.equals("graduation")){
        		    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, graduation);  
        		    }
        		else if(category.equals("random")){
        			
        			quoteList.addAll( Arrays.asList(music) );  
        			quoteList.addAll( Arrays.asList(birthday) );
        			quoteList.addAll( Arrays.asList(friendship) );  
        			quoteList.addAll( Arrays.asList(love) );
        			quoteList.addAll( Arrays.asList(christmas) );  
        			quoteList.addAll( Arrays.asList(graduation) );  
        			
        			
        			Intent i = new Intent(getApplicationContext(), RandomClass.class);
        			i.putExtra("quote", quoteList);
        			startActivityForResult(i, REQUEST_CODE);
        			
        		}
    		      
      		      
    		    // Set the ArrayAdapter as the ListView's adapter.  
    		    setListAdapter(listAdapter); 

    	}

    	@Override
    	public boolean onCreateOptionsMenu(Menu menu) {
    		// Inflate the menu; this adds items to the action bar if it is present.
    		getMenuInflater().inflate(R.menu.mainmenu, menu);
    		return true;
    	}
    	
    }

