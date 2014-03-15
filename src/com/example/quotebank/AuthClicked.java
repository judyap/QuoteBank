package com.example.quotebank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AuthClicked extends Activity {
    
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.authorclick);
        Bundle extras = getIntent().getExtras();
        if(extras==null){
        	return;
        }
        String auth = extras.getString("author");
        
        String mandela ="Nelson Rolihlahla Mandela (/mænˈdɛlə/;[4] Xhosa pronunciation: [xoˈliːɬaɬa manˈdeːla]; 18 July 1918 – 5 December 2013) was a South African anti-apartheid revolutionary, politician, and philanthropist who served as President of South Africa from 1994 to 1999. He was South Africa's first black chief executive, and the first elected in a fully representative democratic election. His government focused on dismantling the legacy of apartheid through tackling institutionalised racism, poverty and inequality, and fostering racial reconciliation. Politically an African nationalist and democratic socialist, he served as President of the African National Congress (ANC) from 1991 to 1997. Internationally, Mandela was Secretary General of the Non-Aligned Movement from 1998 to 1999.";
        String nietzche="Friedrich Nietzsche (1844–1900) was a German philosopher of the late 19th century who challenged the foundations of Christianity and traditional morality. He was interested in the enhancement of individual and cultural health, and believed in life, creativity, power, and the realities of the world we live in, rather than those situated in a world beyond";
        String obama="Born in Honolulu, Hawaii, Obama is a graduate of Columbia University and Harvard Law School, where he served as president of the Harvard Law Review. He was a community organizer in Chicago before earning his law degree. He worked as a civil rights attorney and taught constitutional law at the University of Chicago Law School from 1992 to 2004. He served three terms representing the 13th District in the Illinois Senate from 1997 to 2004, running unsuccessfully for the United States House of Representatives in 2000.";
        String shakespeare="April 1564 (baptised) – 23 April 1616)[nb 1] was an English poet, playwright and actor, widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist.[2] He is often called England's national poet and the \"Bard of Avon\".[3][nb 2] His extant works, including some collaborations, consist of about 38 plays,[nb 3] 154 sonnets, two long narrative poems, and a few other verses, the authorship of some of which is uncertain. His plays have been translated into every major living language and are performed more often than those of any other playwright.";
        String teresa="The Blessed Teresa of Calcutta, M.C.,[1] commonly known as Mother Teresa (26 August 1910 – 5 September 1997), was a Roman Catholic Religious Sister and missionary[2] of Albanian origin who lived most of her life in India of which, since 1948, she was a citizen.";
        String twain="Twain was an American author and humorist. He wrote The Adventures of Tom Sawyer (1876) and its sequel, Adventures of Huckleberry Finn (1885), the latter often called \"the Great American Novel.\"";
        String wilde="Oscar Fingal O'Flahertie Wills Wilde (16 October 1854 – 30 November 1900) was an Irish writer and poet. After writing in different forms throughout the 1880s, he became one of London's most popular playwrights in the early 1890s. Today he is remembered for his epigrams, his only novel (The Picture of Dorian Gray), his plays, and the circumstances of his imprisonment and early death.";
        String winfrey="Oprah Gail Winfrey (born January 29, 1954) is an American media proprietor, talk show host, actress, producer, and philanthropist. Winfrey is best known for her multi-award-winning talk show The Oprah Winfrey Show which was the highest-rated program of its kind in history and was nationally syndicated from 1986 to 2011. Dubbed the 'Queen of All Media', she has been ranked the richest African-American of the 20th century, the greatest black philanthropist in American history, and is currently North America's only black billionaire. She is also, according to some assessments, the most influential woman in the world. In 2013, she was awarded the Presidential Medal of Freedom by President Barack Obama and an honorary doctorate degree from Harvard.";
        String voltaire="François-Marie Arouet (21 November 1694 – 30 May 1778), known by his nom de plume Voltaire, was a French Enlightenment writer, historian and philosopher famous for his wit, his attacks on the established Catholic Church, and his advocacy of freedom of religion, freedom of expression, and separation of church and state. Voltaire was a versatile writer, producing works in almost every literary form, including plays, poems, novels, essays, and historical and scientific works. He wrote more than 20,000 letters and more than 2,000 books and pamphlets. He was an outspoken advocate, despite the risk this placed him in under the strict censorship laws of the time. As a satirical polemicist, he frequently made use of his works to criticize intolerance, religious dogma, and the French institutions of his day.";
        
        TextView textView = (TextView) findViewById(R.id.authname);
		ImageView imageView = (ImageView) findViewById(R.id.authimg);
		TextView textView2 = (TextView) findViewById(R.id.desc);

		textView.setText(auth);
		
		String[] temp = auth.split(" ");
	 
		String authImg = temp[temp.length-1].toLowerCase();
		
		int id = getResources().getIdentifier(authImg, "drawable", getPackageName());
		if(id>0){
			imageView.setImageResource(id);
		}
		else{
			imageView.setImageResource(R.drawable.no_pic);
		}
		
		if(auth.equals("Nelson Mandela")){
			textView2.setText(mandela);
		}
		else if(auth.equals("Friedrich Nietzche")){
			textView2.setText(nietzche);
		}
		else if(auth.equals("Barrack Obama")){
			textView2.setText(obama);
		}
		else if(auth.equals("Mother Teresa")){
			textView2.setText(teresa);
		}
		else if(auth.equals("Oscar Wilde")){
			textView2.setText(wilde);
		}
		else if(auth.equals("Mark Twain")){
			textView2.setText(twain);
		}
		else if(auth.equals("William Shakespeare")){
			textView2.setText(shakespeare);
		}
		else if(auth.equals("Oprah Winfrey")){
			textView2.setText(winfrey);
		}
		else if(auth.equals("Voltaire")){
			textView2.setText(voltaire);
		}
        
    }
    
    public void onclick(View view){
    	finish();
    }
    
    public void finish(){
    	Intent data = new Intent();
    	data.putExtra("returnkey", "Success");
    	setResult(RESULT_OK, data);
    	super.finish();
    }

}
