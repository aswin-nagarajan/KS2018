package com.dpi300.aswinnagarajan.kuruksastra2k18.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.adapters.EventsAdapter;
import com.dpi300.aswinnagarajan.kuruksastra2k18.classes.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static RecyclerView recyclerView;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static Context ctx;
    private static TextView title;
    private static Map<String, List<Event>> listEvents;
 public static
 Map<String,
         Map<String,

                 Map<String,String>>> masterList;


 private OnFragmentInteractionListener mListener;

    public EventFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ELitsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventFragment newInstance(String param1, String param2) {
        EventFragment fragment = new EventFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_elits, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.event_recycler);
        title = (TextView) view.findViewById(R.id.title_clust);
        ctx = getContext();
        listEvents = getAllEvents();
        masterList = getMasterList();
        recyclerView.setAdapter(new EventsAdapter(getContext(),getEventsList("300dpi",getAllEvents()),"300dpi"));
        return view;
    }

    public static List<Event> getEventsList(String cat, Map<String, List<Event>> map){
        List<Event> list = map.get(cat);
        return list;

    }

    //
    //Cluster
    //Event
    //List of description and Rules
    public static
            Map<String,
                    Map<String,

                                    Map<String,String>>> getMasterList(){
        Map<String,
                        Map<String,

                                        Map<String,String>>> masterList = new HashMap<>();

        //initialize all clusters
       Map<String, Map<String,String>> dpiList= new HashMap<>();
       Map<String, Map<String,String>> EList= new HashMap<>();
       Map<String, Map<String,String>> HList= new HashMap<>();
       Map<String, Map<String,String>> TamList= new HashMap<>();
       Map<String, Map<String,String>> StuList= new HashMap<>();
       Map<String, Map<String,String>> ArtList= new HashMap<>();
       Map<String, Map<String,String>> EastList= new HashMap<>();
       Map<String, Map<String,String>> WestList= new HashMap<>();
       Map<String, Map<String,String>> SMTList= new HashMap<>();
       Map<String, Map<String,String>> TelList= new HashMap<>();
     Map<String, Map<String,String>> SFHList= new HashMap<>();

       /*map.put("300dpi",design);
        map.put("Tamizh Sangam",tamlits);
        map.put("Hindi Lits",hlits);
        map.put("English Literary Society",elits);
        map.put("Telugu Lits",tellits);
        map.put("The Studio",studio);
        map.put("Arts",arts);
        map.put("Eastern Dance Team",east);
        map.put("Western Dance Team",west);
        map.put("SASTRA Music Team",smt);*/


     //SFH
     Map<String,String> ev100d = new HashMap<>();
     ev100d.put("desc","Student Short Film Contest");
     ev100d.put("rules","Salle De Cinema is a juried competition, open to only student filmmakers, At leasr Three of the crew members must be students\n" +
             "Running Length of the film must be less than 15 mins\n" +
             "Subtitles must be added for non-english audio or text\n" +
             "Deadline: 20th March, 2018 6pm\n" +
             "Plagiarism is prohibited\n" +
             "Try to avoid vulgarity, obscenity and profanity\n" +
             "Jury's decision is final\n" +
             "Mail your entries to fotohub@sastra.ac.in");

     Map<String,String> ev101d = new HashMap<>();
     ev101d.put("desc","Submit yoyr top photographs on any theme to go to the next round of the competition");
     ev101d.put("rules","This contest is open only to students\n" +
             "the last date for prelims is 13/08/18\n" +
             "Students selected for the preliminary round will go through 2 other rounds for which they will given a theme.\n" +
             "Mail the photos with a caption to fotohub@sastra.ac.in\n" +
             "Max of 3 photographs allowed\n" +
             "Basic Lightroom processing is allowed\n" +
             "Plagiarism is prohibited\n" +
             "Photographs can be taken using only DSLR");


     SFHList.put("Salle De Cinema",ev100d);
     SFHList.put("Online Photography Event",ev101d);


       //300dpi
        Map<String,String> ev1d = new HashMap<>();
        ev1d.put("desc","An Online event focusing on poster making skills. Further details will be shared upon registration in KS website\n");
        ev1d.put("rules","Plagiarism is not encouraged\n" +
                "profanity or vulgarity is strictly prohibited\n" +
                "jpeg should not exceed 5MB and PSD should not exceed 50MB\n" +
                "The JPEG and PSD files should be sent to 300dpi.ks@sastra.ac.in by 20/03/18\n" +
                "Software choice is not restricted\n" +
                "Resolution must be set to 300dpi\n" +
                "Winner is picked based on Creativity, Originality and how much the the given theme is satisfied\n" +
                "Max one entry per Participant ");
        ev1d.put("contact","Bharath: 9994956524");

        Map<String,String> ev2d = new HashMap<>();
        ev2d.put("desc","An Online event focusing on the motion graphics skills. Further details will be shared upon registration in KS website\n");
        ev2d.put("rules","Plagiarism is not encouraged\n" +
                "profanity or vulgarity is strictly prohibited\n" +
                "video should not exceed 25MB and files should not exceed 50MB\n" +
                "The JPEG and PSD files should be sent to 300dpi.ks@sastra.ac.in by 20/03/18\n" +
                "Software choice is not restricted\n" +
                "Resolution must be set to 300dpi\n" +
                "Winner is picked based on Creativity, Originality and how much the the given theme is satisfied\n" +
                "Max one entry per Participant");
     ev1d.put("contact","Bharath: 9994956524");

        dpiList.put("Photo Synthesis",ev1d);
        dpiList.put("Kinetic Typography",ev2d);



        //ELits
        Map<String,String> ev3d = new HashMap<>();
        ev3d.put("desc","Do you know Naruto is? Have you tried doing some alchemy like the Full Metal Alchemist? Have you read the Marvel and DC comics AND watched all the movies a million times? Then this is the perfect quiz for you that consists of games, anime, cartoons and comics!\n");
        ev3d.put("rules","Upto 2 people in a team.\n");
        ev3d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev4d = new HashMap<>();
        ev4d.put("desc","Our great nation needs you! Who was the 12th President of India? Do you know the monuments featured on the new rupee notes? This quiz is all about our country and everything amazing about it.\n");
        ev4d.put("rules","Upto 3 people in a team.");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev5d = new HashMap<>();
        ev5d.put("desc","Are you adept at comprehending the finer aspects of English? A plethora of word games like etymologies, anagrams and rebuses. A host of questions that’ll boggle your mind. All of them lead up to this question- What’s the good word?");
        ev5d.put("rules","Teams of 2\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev6d = new HashMap<>();
        ev6d.put("desc","The Cryptic Crossword is a famous puzzle that can be seen in daily newspapers. If you are a person that looks for a grid that rests in the corner, waiting to be solved, this will be your paradise.");
        ev6d.put("rules","Teams of 2\n" +
                "Prelims will be held during the week. Look out for posters.\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev7d = new HashMap<>();
        ev7d.put("desc","Scrabble is a fun-filled word game that requires you to think of words that can fetch you the highest points using the letters you have. If you think that +50 bonus belongs to you and only you, come and claim it! ");
        ev7d.put("rules","Teams of 2\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev8d = new HashMap<>();
        ev8d.put("desc","Do you think you have the ability to convey something to your friends without uttering a single word? Amaze us with your miming skills and show off your chemistry with your teammates.\n");
        ev8d.put("rules","Teams of 3 and only 3.\n" +
                "No cross reference.\n" +
                "No sounds like.\n" +
                "No splitting. \n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev9d = new HashMap<>();
        ev9d.put("desc","A combination of all the events that happen at ELS. Be prepared to face any challenge thrown at you.\n");
        ev9d.put("rules","Teams of 4. No more, no less.\n" +
                "No cross reference.\n" +
                "No sounds like.\n" +
                "No splitting.\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev10d = new HashMap<>();
        ev10d.put("desc","The signature event at ELS.\n" +
                "One minute to object. One minute to keep talking. One minute to rule them all.\n");
        ev10d.put("rules","No teams. Duh.\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev11d = new HashMap<>();
        ev11d.put("desc","What would you do if you had to face the unknown? Get prepared to ramble on without prior preparation. Extempore will challenge your imagination and will test your ability to portray it effectively.\n");
        ev11d.put("rules","Individual event");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev12d = new HashMap<>();
        ev12d.put("desc","Do you like to argue relentlessly to get your point across? Do you like to leave your opponents dumbfounded with your eloquence? Then this is the perfect platform for you to portray your talent with words. Let the match, begin!\n");
        ev12d.put("rules","Teams of 2\n" +
                "One goes for, one goes against\n" +
                "Prelims will be held during the week. Look out for posters.\n");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev13d = new HashMap<>();
        ev13d.put("desc","A quiz about anything and everything under the sun including it. If you think you know the answer to every question, this quiz is just the thing for you.\n");
        ev13d.put("rules","Upto 3 people in a team. Lone wolves get brownie points.");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        Map<String,String> ev14d = new HashMap<>();
        ev14d.put("desc","Do you think you know your favourite sport better than your friends or are you the one everyone runs to for gadget advice? Does the world of entertainment and the people in it fascinate you? Then don't let your knowledge go unnoticed in the confines of your hostel room. Come flaunt it in the SpEnTech quiz. A spectacular experience assured!\n");
        ev14d.put("rules","Upto 3 people in a team.");
        ev4d.put("contact","Rahul - 9820074864\n" +
                "Arjitha - 9444992570");

        EList.put("Ganimetoonic Quiz",ev3d);
        EList.put("India Quiz",ev4d);
        EList.put("What's The Good Word",ev5d);
        EList.put("Crossword",ev6d);
        EList.put("Scrabble",ev7d);
        EList.put("Dumb Charades",ev8d);
        EList.put("Potpourri",ev9d);
        EList.put("Just A Minute",ev10d);
        EList.put("Extempore",ev11d);
        EList.put("Debate",ev12d);
        EList.put("The Gen Quiz",ev13d);
        EList.put("Spentech Quiz",ev14d);

        //Hindi Lits

        Map<String,String> ev15d = new HashMap<>();
        ev15d.put("desc","Baithe baithe kya karein? Karna hai kuch kaam, shuru karein antakshri, leke unmaad ka naam. Presenting the ageless “ desi” game of Antakshri, and here’s serving it with a twist to spice it up. If you’re mad about Bollywood or have a playlist that’s large enough to play for days on end. We’ve got just the event for you. From bathroom artists to stage performers – anyone who has a song for every occasion is invited. So shed your inhibitions, refresh your memory and grab your claim to fame at Unmaad.\n");
        ev15d.put("rules","1.\u200BAt least the first verse of the song must be sung. If the singer does not remember it in entirety, they cannot use the song.\n" +
                "\n" +
                "2.\u200BNo song can be repeated again in the game.\n" +
                "\n" +
                "3.\u200BNo half answer will be considered.\n" +
                "\n" +
                "4.\u200BJudges decision will be final.\n");
        ev15d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev16d = new HashMap<>();
        ev16d.put("desc","Are you an entertainer? Do you wish to taste the glory of a “dramebaaz”. Unmaad presents “TAMASHA” – a platform to show us the comedian, the actor, the performer inside you. Sign up and release that energy trusting inside you. Get crowned as the biggest nautanki and drama queens\n");
        ev16d.put("rules","1.\u200BVulgarity will not be entertained.\n" +
                "\n" +
                "2.\u200BExtra time for preparation will not be provided .\n" +
                "\n" +
                "3.\u200BWritten script should not exceed the given time.\n" +
                "\n" +
                "4.\u200BIt is not allowed to use the same script (or a substantially similar script) in more than one event at the same contest if there are any common cast members in both events.\n" +
                "5.\u200BIf script is not original, credits for the same should be awarded.\n");
        ev16d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev17d = new HashMap<>();
        ev17d.put("desc","The sound of silence could never have felt this good. What with flailing hands and frantic gestures. We assure you a riot of fun in this wildly popular battle. Bina kuch bol ke bole to “BABU SAMJHO ISHARE”.\n");
        ev17d.put("rules","1.\u200BAir drawing is not permitted.\n" +
                "\n" +
                "2.\u200BIn all rounds the person explaining the thing stands at least 2 feet away from partners.\n" +
                "\n" +
                "3.\u200BThe acting person cannot speak anything from mouth, and cannot point to any object or a person.\n" +
                "\n" +
                "4.\u200BOnly one person comes in front to get a chit from the pool with a name\ton it\n" +
                "\n" +
                "5.\u200BJudges decision will be final\n");
        ev17d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev18d = new HashMap<>();
        ev18d.put("desc","Charcha aadhunik vishiyon par aur apni tippani pradhan kare… one simply needs clarity in thought and arguments to ace this .. just Argue Away..\n" +
                "\n");
        ev18d.put("rules","1.\u200BAbusive language is not allowed.\n" +
                "\n" +
                "2.\u200BVulgarity and profanity will not be allowed.\n" +
                "\n" +
                "3.\u200BNo revision of position of a team is permitted during the debate.\n" +
                "\n" +
                "4.\u200BJudges decision will be final.\n");
        ev18d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev19d = new HashMap<>();
        ev19d.put("desc","Do you know about our incredible India? Do you know about its past, present and future? If the\n" +
                "answer is yes, you have what it takes to call yourself “MAHAN BHARTIYA”.\n");
        ev19d.put("rules","1. Only team maximum of two entries are eligible (individual entry is accepted).\n" +
                "\n" +
                "2.A team shall consist of max two persons.\n" +
                "\n" +
                "3.The decision of the quiz-master will be final and will not be subjected to any change.\n" +
                "\n" +
                "4.The participants shall not be allowed to use mobile or other electronic instruments.\n");
        ev19d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev20d = new HashMap<>();
        ev20d.put("desc","The creation of something new is not accomplished by the intellect but by the play instinct acting from inner necessity. The creative mind plays with the objects it loves. Play with your creative mind and get started for “NAUTANKI SALA”.\n");
        ev20d.put("rules","1.\u200BParticipants will be allotted 5 minutes to perform the act.\n" +
                "\n" +
                "2.\u200BObscenity and offensive gestures are strictly not allowed.\n" +
                "\n" +
                "3.\u200BDecision of the judges will be final and binding.\n");
        ev20d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev21d = new HashMap<>();
        ev21d.put("desc","In the candor inculcating… in the humor of a smile. In the lap of all tomorrow’s …we will sit and talk awhile… few minutes is what you get.. to speak what you set..\n");
        ev21d.put("rules","1.\u200BHindi should be the language of communication.\n" +
                "\n" +
                "2.\u200BTime will be allotted to each contestant on spot.\n" +
                "\n" +
                "3.\u200BThe speech should include a brief introduction of the participant.\n" +
                "\n" +
                "4.\u200BA warning bell will be given at the end of 30 seconds.\n" +
                "\n" +
                "5.\u200BDecision of judges will be considered final.\n" +
                "\n" +
                "6. Discipline is of prime importance.\n" +
                "\n");
        ev21d.put("contact","APOORVA PRIYA – 9444202405");

        Map<String,String> ev22d = new HashMap<>();
        ev22d.put("desc","Once you begin being mentally and physically strong, it is easier to go and on and on, and sooner or later something dreadful happens, but still your heart asks for more, then join us for the event called “dil mange more” and get what you wished for.");
        ev22d.put("rules","1.\u200BDecision of judges will be considered final.\n" +
                "\n" +
                "2.\u200BDiscipline is of prime importance.\n" +
                "\n" +
                "3.\u200BSafety should be the first priority.\n" +
                "\n" +
                "4.\u200BMore\u200B rules and regulation regarding the event will be provided on spot.\n");
        ev22d.put("contact","APOORVA PRIYA – 9444202405");


        HList.put("Antakshari",ev15d);
        HList.put("Dramebaaz",ev16d);
        HList.put("Dumc - Barfi",ev17d);
        HList.put("Debate - Amne Samne",ev18d);
        HList.put("India Quiz",ev19d);
        HList.put("Monoacting - Nautanki Saala",ev20d);
        HList.put("Extempore - Bas Ek Pal",ev21d);
        HList.put("Fun Events",ev22d);


        //Eastern Dance

        Map<String,String> ev23d = new HashMap<>();
        ev23d.put("desc","In this era of pop and rap, we bring to you, from the different parts of the country,  the perfect stage to showcase the graceful dancer in you. With perfect combination of music and eastern dance, nab the trophy with your creativity and synchronised presentation. ");
        ev23d.put("rules","PRELIMS:\n" +
                "VIDEO PRELIMS \n" +
                "The team should send a video of minimum 3 to maximum 5 minutes from the routine to thandavsdt@gmail.com .   \n" +
                "Subject of the mail should be (KURUKSASTRA’18 CHOREONITE PRELIMS _COLLEGE NAME_TEAM NAME)\n" +
                "Event Registration and fee payment MUST BE completed before sending the Video.\n" +
                "Last date for sending the Video is 14.03.2018\n" +
                "Results will be announced in the Facebook page by 16.03.2018.\n" +
                "\n" +
                "                    FINALS : \n" +
                "Total number of dancers: 8-25. Stage help : maximum 3 \n" +
                "Total time given to each team is 10 minutes which includes 2 minutes of setup time (8+2 mins)\n" +
                "Minimum number of participants on stage at any point of time of the performance: 2\n" +
                "Fire, water, powder and other properties that can damage the stage are strictly not allowed. \n" +
                "Any kind of vulgarity and profanity in both performance and costumes will not be entertained.\n" +
                "For any kind of additional requirements , kindly notify the organisers in prior.\n" +
                "Judges decision is final.\n" +
                "\n");
        ev23d.put("contact","1. SRIDHANYA.H\n" +
                "      Ph: +919003954907\n" +
                " \n" +
                " 2.  LAKSHMI.M\n" +
                "      Ph:+91 8056596472\n");

        Map<String,String> ev24d = new HashMap<>();
        ev24d.put("desc","A city rich with history, is incomplete without the classical dance form. And what better way can there be, to portray the journey of dance from the past to the present but ‘Fusion’? The stage is set for you to give us the grace in your dance with abhinaya and nritta and fuse it to the rhythms of the present. With the perfect blend of all the elements of classical dance, we bring you this solo classical event.\n");
        ev24d.put("rules","Date: 25th March 2018                      \n" +
                "·         Round 1:\n" +
                "The participant is to perform a pure classical piece of his/her choice for a maximum of 3 mins.\n" +
                " Classical costume is mandatory.\n" +
                "Any form of classical dance maybe performed.\n" +
                " \n" +
                "·         Round 2:\n" +
                "It’s a surprise round wherein the selected participants will be given a 30 second fusion number with a concept on spot , putting their creativity and spontaneity to test.\n");
        ev24d.put("contact","1. SRIDHANYA.H\n" +
                "      Ph: +919003954907\n" +
                " \n" +
                " 2.  LAKSHMI.M\n" +
                "      Ph:+91 8056596472\n");
        EastList.put("Choreonite", ev23d);
        EastList.put("Nrithya Madhuryam",ev24d);

        //SMT

        Map<String,String> ev25d = new HashMap<>();
        ev25d.put("desc","Be prepared to be transported to every nook and corner of the majestic country that is India.\n" +
                "Showcase your exhilarating and stage-rocking music at the Eastern Band Event (insert name of\n" +
                "event here). Explore the colourful harmonic caves of the nation and take your audience on a trip,\n" +
                "quite literally. Pack your bags, grab your instruments and get ready for the musical ‘Adventure of a\n" +
                "Lifetime’.");
        ev25d.put("rules","A band can have a maximum of 12 members on stage.\n" +
                "• Every band is allowed 18 minutes of stage time including setup.\n" +
                "• A standard 5 piece kit, a keyboard stand and amps will be provided.\n" +
                "• The use of arpeggiators and pre-recorded beats are not allowed.\n" +
                "• Own compositions will be awarded extra points.\n" +
                "• Bands will be judged based on their tightness, clarity and dynamics.\n" +
                "• No form of vulgarity will be tolerated on stage");
        ev25d.put("contact","");

        Map<String,String> ev26d = new HashMap<>();
        ev26d.put("desc","Music transcends boundaries. Here is an avenue to exhibit your singing talent and an opportunity to\n" +
                "enthral the audience with your mellifluous singing. We present to you KS IDOL, the stage that will\n" +
                "witness aspiring singers showcasing their singing prowess to win this glorious title.");
        ev26d.put("rules","The event will consist of three rounds.\n" +
                "• Participants can perform songs from any Indian movie or album in the first round.\n" +
                "• The participants will be informed about the other two rounds on the spot.\n" +
                "• All the participants are expected to be prepared with 3 or 4 songs in different genres.\n" +
                "• The Judge's decision will be final.\n" +
                "• Event registration will be done on the spot.\n" +
                "• Participants should have a valid college ID");
        ev26d.put("contact","");

        Map<String,String> ev27d = new HashMap<>();
        ev27d.put("desc","Devotion can be enjoyed, felt and rejoiced through music. We welcome you to participate in our\n" +
                "(insert name of event here) event to celebrate the enchanting renditions in this rich cultural heritage.\n" +
                "Let's come together in the spirit of music! ");
        ev27d.put("rules","Participants have to perform a Carnatic or Hindustani piece only.\n" +
                "• Each participant will be given 5 minutes on stage.\n" +
                "• Accompaniments are not allowed.\n" +
                "• Ragam, Neraval and Kalpanaswaram will fetch extra points.\n" +
                "• A Shruti box will be provided during the event.\n" +
                "• The Judge’s decision will be final. ");
        ev27d.put("contact","");

        Map<String,String> ev28d = new HashMap<>();
        ev28d.put("desc","Do you think that you are the next Adele, Chris Martin, Rihanna or John Mayer? Do you want to\n" +
                "break away from the crowd and go solo? Look no further! This is your ticket to take us across the\n" +
                "globe and enthral us with the magic of your voice.");
        ev28d.put("rules","Participants have to perform songs in English only.\n" +
                "• Each participant will be given 5 minutes on stage.\n" +
                "• Either a karaoke track or one accompanying instrument is allowed.\n" +
                "• The Judge’s decision will be final.");
        ev28d.put("contact","");

        Map<String,String> ev29d = new HashMap<>();
        ev29d.put("desc","Travel across the ethnic dimensions of Indian music and experience the thrill of Raagas and\n" +
                "different Taalas. Show the world that you are indeed the true master of your instrument. We invite\n" +
                "all the aspiring musicians out there to embark on a journey and to rediscover eastern instrumental\n" +
                "music. ");
        ev29d.put("rules","• Participants have to perform a Carnatic, Hindustani or Western piece only.\n" +
                "• Each participant is given a time limit of 5 minutes onstage.\n" +
                "• The Judge’s decision will be final.\n" +
                "• Film songs played as instrumental are strictly not allowed.\n" +
                "• A keyboard stand and guitar amps will be provided.");
        ev29d.put("contact","");

        Map<String,String> ev30d = new HashMap<>();
        ev30d.put("desc","Do you think that you are the next Cory Henry, Michael League or Mark Lettieri? Do your hands\n" +
                "itch to play the best solo that this world has ever heard? Itch no further. Plug in your instrument and\n" +
                "blow our minds with amazing riffs and delicate runs at Kuruksastra’s (insert name of event here).");
        ev30d.put("rules","• Participants have to perform a Carnatic, Hindustani or Western piece only.\n" +
                "• Each participant is given a time limit of 5 minutes onstage.\n" +
                "• The Judge’s decision will be final.\n" +
                "• Film songs played as instrumental are strictly not allowed.\n" +
                "• A keyboard stand and guitar amps will be provided.");
        ev30d.put("contact","");

        SMTList.put("Eastern Band Event",ev25d);
        SMTList.put("KS Idol",ev26d);
        SMTList.put("Carnatic Solo vocal",ev27d);
        SMTList.put("Western Solo Vocal",ev28d);
        SMTList.put("Instrumental: Eastern",ev29d);
        SMTList.put("Instrumental: Western",ev30d);

        //WestDance


        Map<String,String> ev31d = new HashMap<>();
        ev31d.put("desc","If you are a lover of dance and yet find it challenging to go solo on stage, find a partner or two, sync your mind and moves to your favourite tunes and grab this opportunity to showcase your treasure of talent, in the Dual-Trio dance event of Kuruksastra '18. Enchant us with your moves ,overcome your hitches and create an identity with your partner(s)!\n");
        ev31d.put("rules","1. 2 (or) 3 participants in a team. \n" +
                "2. Time limit: 2 to 3 mins.\n" +
                " 3. Free to dance in more than 1 style.\n" +
                " 4. Participants should prepare their own music track, brought in a separate pen drive containing only the track.\n" +
                " 5. Track to be submitted at the time of registration. \n" +
                "6. Top 4 teams will qualify to the next round, a battle round.  \n" +
                "About battle round: The qualified teams will be made to adapt tune to songs of any genre or language of 1 minute each, along with one surprise element which will be revealed before the battle rounds. Vulgarity and profanity will not be entertained at any cost.   \n");
        ev31d.put("contact","Sowmya : 8438238224\n" +
                "Pramod :8110924172");

        Map<String,String> ev32d = new HashMap<>();
        ev32d.put("desc","Dance is music made visible to eyes. Have you got the flair to make this happen and dance the night out in parties? Here's your chance to dance to some of the most famous tunes, on the spot, right out of your head and turn it into the viewer's delight! Participate in the solo dance event of Kuruksastra '18, express yourself on stage as you would in your shower and spread the music to the world as a visual treat!\n");
        ev32d.put("rules","1. DJ will play 3 different songs one after the other for 40 secs each and participants must dance for the same.\n" +
                " 2. No preparation time will be given (Adapt tune)\n" +
                " 3. Judgement will be based on spontaneity, adaptivity and how well you entertain the audience.\n" +
                " 4. Top 4 will qualify to the next round, a battle round \n" +
                "About battle round: The qualified participants will be made to adapt tune to songs of any genre or language of 1 minute each . Vulgarity and profanity will not be entertained at any cost.\n");
        ev32d.put("contact","Sowmya : 8438238224\n" +
                "Pramod :8110924172");

        Map<String,String> ev33d = new HashMap<>();
        ev33d.put("desc","Dancers are said to be God's own athletes, sweating out hard just to experience the unison between the rhythm of the heartbeat, music and the feet. Are you one of those crazy souls with a passionate crew? Then sweat out a bit more and show us your best routines. Set the stage and your heart alight with your most comfortable styles of dance. Battle it out on the Choreo Night, against some of the best dance crews, showing the world why your crew is the best combo of God's most favorite athletes! \n");
        ev33d.put("rules","1.  1st round is video prelims. Please send the YouTube link of your latest performance to ‘insidersastra@gmail.com’ on or before 19/03/2018.\n" +
                "2. On 23th morning, there will be another prelims ,wherein one person is required to wear the costume necessarily. The shortlisted teams will be allowed to perform on stage.\n" +
                " 3. Only Western styles are allowed. \n" +
                "4. Each team is given a time slot of 7 minutes (6+1) including stage setup.\n" +
                " 5. Number of participants per team is 6 to 30 with a maximum of  2 back stage helpers. \n" +
                "6. Only one team per category is allowed per college. \n" +
                "7.  Each team must submit a bonafide certificate for all the participants of the team signed by the head of their institute. \n" +
                "8. Fire, water and other properties that can damage the stage are strictly not allowed. No indecency during performance. \n" +
                "9. All team members should have their college ID cards. \n" +
                "10. Copied routines will not be entertained. \n" +
                "11. Judges decision is final. \n" +
                "12. During the performance team members are responsible for their belongings.");
        ev33d.put("contact","Sowmya : 8438238224\n" +
                "Pramod :8110924172");

        WestList.put("Dual Trio",ev31d);
        WestList.put("Solo Dance",ev32d);
        WestList.put("Choreo Night",ev33d);


        //Studio

        Map<String,String> ev34d = new HashMap<>();
        ev34d.put("desc","Come indulge in the world of theatre and make believe. The stage is set for the best of teams to prove their mettle as theatre artists. Participate in The Studio’s flagship event and one of Kuruksastra’s premium events, if you believe you can sway an audience and draw them into the magic that is theare.");
        ev34d.put("rules","1: The play should be of 30-45 minutes duration, empty stage to empty stage.\n" +
                "2: No vulgarity or profanity will be tolerated.\n" +
                "3: Number of participants per team: 10+2(Crew)\n" +
                "4: Submission date for scripts: 15th March.\n" +
                "5: The scripts should be mailed to dramatics.studio@gmail.com by 11:59 P.M, March 15th.\n" +
                "6: Props and costumes must be arranged by the participating teams. Directors are requested to notify us by 18th March with requirements of tables and chairs.");
     ev34d.put("contact","Abhinav Sridhar: 8179873670\n" +
             "Madhusudhan: 9884792719");
        Map<String,String> ev35d = new HashMap<>();
        ev35d.put("desc","Join the battle in any attire. Use any weapon of your choice. Can you survive the war of thespians and emerge as the last man standing?");
        ev35d.put("rules","1: The time-limit is 5 to 8 minutes.\n" +
                "2: The script can be a monologue or a mono-act.\n" +
                "3: Vulgarity and profanity is strictly prohibited.\n" +
                "4: The participant needs to carry his or her own prop, or costume, if it is pivotal to the act.\n" +
                "5: Original scripts carry brownie points.\n" +
                "6: There will be a preliminary round where based on judge’s decision, participants will qualify for the final round.\n" +
                "7: Judge’s decision is final and binding.");
     ev35d.put("contact","Abhinav Sridhar: 8179873670\n" +
             "Madhusudhan: 9884792719");

        Map<String,String> ev36d = new HashMap<>();
        ev36d.put("desc","With only wit by your side, are you ready to test your acting chops? Do you have what it takes to tackle any situation thrown at you?\n" +
                "Come, fly the fight of fantasy as you face exciting and unpredictable challenges across your journey.");
        ev36d.put("rules","1: A team consists of four participants: no more, no less.\n" +
                "2: The event consists of multiple elimination rounds.\n" +
                "3: Event specifics will be revealed only before the event begins.\n" +
                "4: Vulgarity and profanity are strictly prohibited.\n" +
                "5: Qualification to the final round is purely based on the judge’s discretion and is binding.\n" +
                "6: No use of lights and sounds will be allowed.");
        ev36d.put("contact","Abhinav Sridhar: 8179873670\n" +
                "Madhusudhan: 9884792719");

        StuList.put("Act Play",ev34d);
        StuList.put("Mono Acting",ev35d);
        StuList.put("Improv Event",ev36d);

        //TelList

        Map<String,String> ev37d = new HashMap<>();
        ev37d.put("desc","This is a music event. Basic music knowledge is enough to participate in this event. This event is having 3 rounds.\n");
        ev37d.put("rules","1) Max 3 per team.\n" +
                "       2)  Teams are selected on prelims basis.\n");
     ev37d.put("contact","");

        Map<String,String> ev38d = new HashMap<>();
        ev38d.put("desc","This is a drama event. In this we mainly concentrate on your acting and script.\n");
        ev38d.put("rules","1) Max 10 per team.\n" +
                "     2) Drama length is upto 15  mins.\n" +
                "     3)  Script should be submitted within time.\n" +
                "     4) Teams are selected on prelims basis.\n" +
                "     5) In prelims every team has to perform for 3-4 mins.\n" +
                "     6) Team will be disqualified, if there is any usage of unparliamentary language.\n");
     ev38d.put("contact","");
        Map<String,String> ev39d = new HashMap<>();
        ev39d.put("desc","This is an acting event. Here spontaneity plays a key role. You will be awarded for your spontaneous actions.\n");
        ev39d.put("rules","1) Max 3 per team.\n" +
                "     2) Teams are selected on prelims basis.\n");
     ev39d.put("contact","");

        Map<String,String> ev40d = new HashMap<>();
        ev40d.put("desc","It is a misc event. It is very funny round having games and many misc events");
        ev40d.put("rules","1) Max 3 per team\n" +
                "     2) Teams are selected on prelims basis");
     ev40d.put("contact","");

        Map<String,String> ev41d = new HashMap<>();
        ev41d.put("desc","This is a quiz event on general knowledge, sports and movies.\n" +
                "\n");
        ev41d.put("rules","1) Max 3 per team.\n" +
                "   2) Teams are selected on prelims basis.\n" +
                "\n");
     ev41d.put("contact","");

        Map<String,String> ev42d = new HashMap<>();
        ev42d.put("desc","");
        ev42d.put("rules","2 per team.");
        ev42d.put("contact","");

        TelList.put("Pataku Pranam Pallavi Aithe",ev37d);
        TelList.put("Rangasthalamr",ev38d);
        TelList.put("Oke okka Chance",ev39d);
        TelList.put("Evadi Gola Vadidhi",ev40d);
        TelList.put("Mr Medhavi",ev41d);
        TelList.put("Treasure hunt",ev42d);


        //Arts list

        Map<String,String> ev43d = new HashMap<>();
        ev43d.put("desc","Use the subtle interplay of light and darkness to portray your imagination.\n");
        ev43d.put("rules","Maximum 3 per team (Minimum 2 members)\n" +
                "Use of materials other than the ones provided might lead to disqualification\n" +
                "Topics will be given on the spot\n" +
                "Judges decision will be final\n" +
                "Use of external references is not allowed\n" +
                "Timings: 1.00 p.m.-3.00 p.m.\n" +
                "Date: 23/03/2018 (Day 1)\n" +
                "Venue: Chith Vihar (CTV)\n");
        ev43d.put("contact",
                "Sharad – 9941389261\n" +
                "Debesh – 9962439657\n" +
                "Prize money\n" +
                "First- Rs. 1800\n" +
                "Second- Rs. 1500\n" +
                "Third- Rs. 1200\n");

        Map<String,String> ev44d = new HashMap<>();
        ev44d.put("desc","A gentle stroke of the brush, a tinge of glitter and an overflowing imagination.\n");
        ev44d.put("rules","2 per team (1 painter and 1 to be painted on)\n" +
                "Use of materials other than the ones provided might lead to disqualification\n" +
                "Topics will be given on the spot\n" +
                "Judges decision will be final\n" +
                "Use of external references is not allowed\n" +
                "Timings: 9.30 a.m.-11.00 a.m.\n" +
                "Date: 24/03/2018 (Day 2)\n" +
                "Venue: Chith Vihar (CTV)\n");
        ev44d.put("contact","Sharad – 9941389261\n" +
                "Aishwarya – 7358597745\n" +
                "Prize money\n" +
                "First- Rs. 1500\n" +
                "Second- Rs. 1000\n" +
                "Third- Rs. 750");

        Map<String,String> ev45d = new HashMap<>();
        ev45d.put("desc","An action-packed event where you pass on the baton to your team-mate to finish your half done masterpiece.\n");
        ev45d.put("rules","2 per team \n" +
                "Use of materials other than the ones provided might lead to disqualification\n" +
                "Topics will be given on the spot\n" +
                "Judges decision will be final\n" +
                "Use of external references is not allowed\n" +
                "Timings: 9.30 a.m.-11.00 a.m.\n" +
                "Date: 25/03/2018 (Day 3)\n" +
                "Venue: Chith Vihar (CTV)\n");
        ev45d.put("contact","Sakthibala – 9047378043\n" +
                "Debesh – 9962439657\n" +
                "Prize money\n" +
                "First- Rs. 1000\n" +
                "Second- Rs. 800\n" +
                "Third- Rs. 600\n");

        Map<String,String> ev46d = new HashMap<>();
        ev46d.put("desc","Online event\nIf you believe that your artwork has the ability to capture people’s attention, submit them and get a chance to showcase them in our very own Gallery.\n");
        ev46d.put("rules","Send in your entries to arts.ks@sastra.ac.in \n" +
                "Last date for submission: 18/03/2018\n" +
                "Maximum Entries per person: 5\n");
        ev46d.put("contact","Bhavna – 9444769491\n" +
                "Shraddha - 7708344408");

        ArtList.put("Shadow Art",ev43d);
        ArtList.put("Face tatoo Making",ev44d);
        ArtList.put("Relay Art",ev45d);
        ArtList.put("Hall of Fame",ev46d);


        //Tamil list

        Map<String,String> ev47d = new HashMap<>();
        ev47d.put("desc","“பதார்க்கபம் உங்கள் முன்பண\n" +
                "தீட்ட ப\u0BACண்டி\u0BA6து \u0BACாள்முநணந\u0BA6 அல்ன..\n" +
                "உங்கள் \u0BA2ாமுநணந\u0BA6த் \u0BA1ான்..\n" +
                "ஆம்! இது ஒரு சசாற்பதார்க்கபம்!!!”\n");
        ev47d.put("rules","• \u0BA1னி\u0BA2தர் பதச்சுப்பதாட்டி.\n" +
                "• பதாட்டிக்காண \u0BA1நனப்பு பதாட்டி \u0BA2ாபன்று \u0BA1\u0BA7ப்தடும்.\n" +
                "• மு\u0BA1ல் சுற்று \u0BA1னிப்பதச்சாகவும் இ\u0BA7ண்டாம் சுற்று கருத்\u0BA1\u0BA7ங்கு \u0BACடிவிலும்\n" +
                "அந\u0BA5யும்.\n" +
                "• \u0BACன்\u0BA5மும் ஈண\u0BA1ன்ந\u0BA5யும் இல்னாதிருக்க ப\u0BACண்டும்.\n" +
                "• பிநச\u0BA5ாழி கன\u0BACா\u0BA1 எளி\u0BA6 \u0BA1மிழ் \u0BA2நட பதாது\u0BA5ாணது.\n" +
                "• \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணது.\n");
        ev47d.put("contact","இ\u0BA7ாம்\u0BA2ாத்:8148698795\n" +
                "ஞாணதா\u0BA7தி: 9626663259");

        Map<String,String> ev48d = new HashMap<>();
        ev48d.put("desc","\"இனக்கி\u0BA6ங்கள் இ\u0BA6னாக இனக்க\u0BA0ங்கள் இநசதாட... தநடப்புகள் தாடம்\n" +
                "சசால்ன..\n" +
                "அ\u0BA1ன் தரிசுகள் \u0BA1ாபம் பதாட...\n" +
                "இனி ஆடுப\u0BACாம் ஒரு \u0BA1மிழாட்டம்..!!\"");
        ev48d.put("rules","\uF0B7 அணி\u0BA6ாகப் தங்பகற்கும் \u0BA1மிழ்ப் பதாட்டி.\n" +
                "\uF0B7 அணிக்கு இரு\u0BACர்.\n" +
                "\uF0B7 \u0BA1குதிச்சுற்று \u0BA1மிழ் சார்ந்\u0BA1 சதாது விணாக்கள் சகாண்ட எழுத்துச்சுற்று.\n" +
                "\uF0B7 இறுதிச்சுற்று விணாடி விணா \u0BACடிவில் அந\u0BA5யும்.");
        ev48d.put("contact","கசஶாத்ரி:8508184683\n" +
                "ஞாணதா\u0BA7தி:9626663259");

        Map<String,String> ev49d = new HashMap<>();
        ev49d.put("desc","\"கற்தநணத் தூரிநக பிடித்து- அதில்\n" +
                "\u0BA1மிழிணத்தின் \u0BACண்\u0BA0ம் ப\u0BA1ாய்த்து தீட்டிடுவீர் ஓர் எழுத்க\u0BA1ாவி\u0BA6ம்...!!\"\n");
        ev49d.put("rules","\uF0B7 \u0BA1னி \u0BA2தர் தங்பகற்கும் பதாட்டி.\n" +
                "\uF0B7 எழுதும் கந\u0BA1 சசாந்\u0BA1 தநடப்தாக இருத்\u0BA1ல் அ\u0BACசி\u0BA6ம்.\n" +
                "\uF0B7 கந\u0BA1 \u0BA2\u0BA6ம், கற்தநண திநன், \u0BA1மிழ் ஆளுந\u0BA5 – இ\u0BACற்நநச் சார்ந்து ஒப\u0BA7\n" +
                "சுற்நாய் அந\u0BA5ந்திருக்கும்.\n" +
                "\uF0B7 சூ\u0BABல்/\u0BA1நனப்பு பதாட்டி \u0BA2ாபன்று \u0BAC\u0BABங்கப்தடும்\n" +
                " \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணத");
     ev49d.put("contact","ஹரிணி:9884242165");

        Map<String,String> ev50d = new HashMap<>();
        ev50d.put("desc","\"கருப்பு ந\u0BA5மீது காகி\u0BA1ம் சகாண்ட கா\u0BA1நன..\n" +
                "சிநப்பு ச\u0BA5ாழி சகாண்டு நீ \u0BACார்க்கும் கவிந\u0BA1ந\u0BA6..\n" +
                "\u0BACாழ்த்தி \u0BAC\u0BA7ப\u0BACற்கிநது \u0BA1மிழ்ச் சங்கத்தின் கவித்க\u0BA1ாப்பு...!!\"\n");
        ev50d.put("rules","\uF0B7 இ\u0BA7ண்டு சுற்றுகபாக \u0BA2நடசதறும்.\n" +
                "\uF0B7 பதாட்டி \u0BA2ாபன்று \u0BA1நனப்புகள் சகாடுக்கப்தடும்.\n" +
                "\uF0B7 தநடப்பின் \u0BA1ாக்கம், \u0BA2நட, அந\u0BA5ப்பு ஆகி\u0BA6ந\u0BAC \u0BA5திப்பிடப்தடும்.\n" +
                "\uF0B7 \u0BA2டு\u0BACர்களின் முடிப\u0BAC இறுதி\u0BA6ாணது.\n");
     ev50d.put("contact","சஶாங்க்:9597702237");

        Map<String,String> ev51d = new HashMap<>();
        ev51d.put("desc","“தடம்பிடிக்க ப\u0BACண்டாம்,\n" +
                "தடம் பிடித்\u0BA1ால் பதாதும்.\n" +
                "\u0BA7சிகர்களுக்காண ப\u0BA5நட இது!!!”");
        ev51d.put("rules","\uF0B7 அணிக்கு மூ\u0BACர்.\n" +
                "\uF0B7 \u0BA1குதி சுற்றில் ப\u0BA1ர்ந்ச\u0BA1டுக்கப்தடும் அணிகள் \u0BA5ட்டும் இறுதி பதாட்டியில்\n" +
                "தங்பகற்க அனு\u0BA5தி.\n" +
                "\uF0B7 பிநச\u0BA5ாழி தடங்கள் \u0BA5ற்றும் ச\u0BA5ாழி \u0BA5ாற்நம் சசய்\u0BA1 தடங்களில் இருந்து\n" +
                "பகள்விகள் பகட்கப்தட\u0BA5ாட்டாது.\n");
     ev51d.put("contact","சந்தி\u0BA7ச\u0BA5ௌலி: 9080610577\n" +
             "\u0BA5கணாஜ்: 9500304481\n" +
             "விஸ்வ\u0BA2ா\u0BA1ன்: 9043348647");

        Map<String,String> ev52d = new HashMap<>();
        ev52d.put("desc","“ந\u0BAC\u0BA7\u0BA5ாண \u0BACரிகள்...\n" +
                "\u0BA7ம்மி\u0BA6\u0BA5ாண \u0BA7ாகங்கள்...\n" +
                "ப\u0BA1ன் சிந்தும் \u0BA1ாபங்கள்...\n" +
                "பிடித்\u0BA1ாபன பதாதுப\u0BA5 ச\u0BA5ட்டுப்பதாட!!!”");
        ev52d.put("rules","\uF0B7 அணிக்கு மூ\u0BACர்.\n" +
                "\uF0B7 \u0BA1குதி சுற்றில் ப\u0BA1ர்ந்ச\u0BA1டுக்கப்தடும் அணிகள் \u0BA5ட்டும் இறுதி பதாட்டியில்\n" +
                "தங்பகற்க அனு\u0BA5தி.\n" +
                "\uF0B7 \u0BA1மிழ் சினி\u0BA5ாவில் இடம்சதற்ந தாடல்களில் இருந்து \u0BA5ட்டுப\u0BA5 பகள்விகள்\n" +
                "பகட்கப்தடும்.\n");
     ev52d.put("contact","சந்தி\u0BA7ச\u0BA5ௌலி: 9080610577\n" +
             "\u0BA5கணாஜ்: 9500304481\n" +
             "விஸ்வ\u0BA2ா\u0BA1ன்: 9043348647");

        Map<String,String> ev53d = new HashMap<>();
        ev53d.put("desc","\"அந\u0BA5திந\u0BA6 ஒலி\u0BA6ாக்கி...\n" +
                "அ\u0BA7ங்கத்தின் ஒளியில்...\n" +
                "ச\u0BA5ௌணத்ந\u0BA1 ச\u0BA5ாழி\u0BA6ாக்கி...\n" +
                "சரித்தி\u0BA7ம் தநடக்க \u0BACாரீர் ...!");
        ev53d.put("rules","• அணிக்கு மூ\u0BACர்.\n" +
                "• \u0BA1குதி சுற்றில் ப\u0BA1ர்ந்ச\u0BA1டுக்கப்தடும் அணிகள் \u0BA5ட்டுப\u0BA5 இறுதிப் பதாட்டியில்\n" +
                "கனந்து சகாள்ப அனு\u0BA5திக்கப்தடு\u0BACார்கள்.\n" +
                "• \u0BA2டிப்த\u0BACர்கள் \u0BACாய் அநசத்\u0BA1ல் கூடாது.\n" +
                "• \u0BACார்த்ந\u0BA1கநப அர்த்\u0BA1ம்இல்னா\u0BA5ல் பிரித்\u0BA1ல் கூடாது.\n" +
                "• \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணது.\n");
     ev53d.put("contact","சந்தி\u0BA7ச\u0BA5ௌலி: 9080610577\n" +
             "\u0BA5கணாஜ்: 9500304481\n" +
             "விஸ்வ\u0BA2ா\u0BA1ன்: 9043348647");

        Map<String,String> ev54d = new HashMap<>();
        ev54d.put("desc","“விதி\u0BA6ல்ன, விநப\u0BA6ாடு! \u0BA5திப\u0BA6ாடு பதா\u0BA7ாடு! \u0BACா! ச\u0BACற்றி \u0BACாநக சூடு!\n" +
                "விஞ்ஞாணம் ச\u0BA5ய்ஞாணமும் எஞ்ஞாணமும் உஞ்ஞண\u0BA5ாக!\n" +
                "நீ\u0BA1ாபண \u0BA7ாஜா ! எங்கள் ஆல் இன் ஆல் அ\u0BABகு\u0BA7ாஜா!!!”\n");
        ev54d.put("rules","• அணிக்கு மூ\u0BACர்.\n" +
                "• \u0BA1குதிச்சுற்றில் ப\u0BA1ர்ந்ச\u0BA1டுக்கப்தடும் அணிகபப இறுதிச்சுற்றுக்கு அனு\u0BA5திக்க\n" +
                "தடு\u0BACார்கள் .\n" +
                "• சினி\u0BA5ா,\u0BA1மிழ்,சதாது அறிவு,பதச்சுத்திநன் அநணத்தும் பசாதிக்கப்தடும்.\n" +
                "• \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணது .");
     ev54d.put("contact","ஜீவ\u0BA1ாரிணி: 7502111006\n" +
             "ஆ\u0BA1ர்ஷ்: 8807330205");

        Map<String,String> ev55d = new HashMap<>();
        ev55d.put("desc","“சிரிப்தப\u0BA1ா எளிது\n" +
                "சிரிக்க ந\u0BACப்தப\u0BA1ா அரிது\n" +
                "அநம்தட அவ்\u0BACரி\u0BA6 சச\u0BA6நனச் சசய்\u0BA6 திநம்தட \u0BACாரீர்.....”\n");
        ev55d.put("rules","விதிமுறநகள்:\n" +
                "\uF0B7 அணிக்கு இரு\u0BACர் \u0BA5ட்டும்.\n" +
                "\uF0B7 ஆதாசம் \u0BA5ற்றும் அ\u0BA7சி\u0BA6ல் \u0BA2நகச்சுந\u0BAC அநப\u0BAC கூடாது.\n" +
                "கதாட்டியின் சுற்றுகள்:\n" +
                "\uF0B7 மு\u0BA1ல் சுற்று\n" +
                "தங்பகற்தாபரின் விருப்தம் (Either Mimicry,Stand-up,Variety)\n" +
                "சகாடுக்கப்தடும் அ\u0BACகாசம்: 5 நிமிடங்கள்.\n" +
                "\uF0B7 இ\u0BA7ண்டாம் சுற்று\n" +
                "ஒலி \u0BA5ாற்று \u0BA2நகச்சுந\u0BAC (Video Spoof)\n" +
                "கதாட்டியின் விரிவாக்கம்:\n" +
                "மு\u0BA1லில் \u0BA1குதிச் சுற்று \u0BA2நடசதறும். அதில் தங்பகற்தாபர்கள் அ\u0BACர்கள்\n" +
                "விருப்தத்திற்கு ஏற்த \u0BA2நகச்சுந\u0BACத் திநநண ச\u0BACளிப்தடுத்\u0BA1 ப\u0BACண்டும்(Either\n" +
                "Mimicry,Stand-up,Variety or Video Spoof).அதில் \u0BA1குதி சதறுத\u0BACர்கள் இறுதிச்\n" +
                "சுற்றில் தங்பகற்கனாம்.இறுதிச் சுற்றின் இ\u0BA7ண்டா\u0BACது சுற்றுக்காண வீடிப\u0BA6ா எங்கபது\n" +
                "\u0BA1\u0BA7ப்பில் பதாட்டிக்கு ஒரு \u0BA2ாள் முன் \u0BA1\u0BA7ப்தடும்.");
     ev55d.put("contact","\u0BA5ா\u0BA6ா:7639498065\n" +
             "சந்துரு: 8056422291");

        Map<String,String> ev56d = new HashMap<>();
        ev56d.put("desc","\"எழுத்தின் சக்தி, தா\u0BACத்தின் அ\u0BABகு, இநசயின் \u0BA5\u0BA6க்கம், இந\u0BAC\u0BA6ாவும் கனந்து, கந\u0BA1\n" +
                "சந\u0BA5த்து, தாத்தி\u0BA7ம் உருத்து, \u0BA1ன்னிநன \u0BA5நந்து, \u0BA1ன்நணத் ச\u0BA1ாநனத்து \u0BA2வ\u0BA7சம்\n" +
                "காட்டி ப\u0BA5நடந\u0BA6 ஆட்க்சகாள்ப அநண\u0BACந\u0BA7யும் \u0BAC\u0BA7ப\u0BACற்கிநது\n" +
                "சாஸ்த்\u0BA7ா \u0BA1மிழ்ச் சங்கம் \"\n");
        ev56d.put("rules","• குழுவில் அதிகதட்சம் 12 பதர் இருக்கனாம். ( இநச \u0BA5ற்றும் ப\u0BA5நட\n" +
                "அந\u0BA5ப்பிற்காண 2 பதர் பசர்த்து)\n" +
                "• திந\u0BA7யிநச அல்னா\u0BA1 ததிவுசசய்\u0BA6ப்தட்ட அல்னது \u0BACாத்தி\u0BA6 இநசந\u0BA6ப்\n" +
                "த\u0BA6ன்தடுத்\u0BA1னாம்.\n" +
                "• ப\u0BA5நட அந\u0BA5ப்பிற்காண ப\u0BA2\u0BA7ம் உட்தட 25 நிமிடங்கள்\n" +
                "அளிக்கப்தடும்.அதிக\u0BA5ாக எடுத்துக்சகாள்பப்தடும் ஒவ்ச\u0BACாரு நிமிடத்திற்கும்\n" +
                "\u0BA5திப்சதண்கள் குநநக்கப்தடும்.\n" +
                "• குழுக்கள் \u0BA1ங்கள் \u0BA2ாடகத்ந\u0BA1 விபம்த\u0BA7ப்தடுத்\u0BA1ச் சு\u0BACச\u0BA7ாட்டிகள்\n" +
                "சகாண்டு\u0BAC\u0BA7னாம்.\n" +
                "• அந\u0BACக்குப் சதாருந்\u0BA1ா\u0BA1ச் சசய்நககள் கட்டா\u0BA6\u0BA5ாகத் \u0BA1விர்க்கப் தட ப\u0BACண்டும்\n" +
                "• \u0BA1மி\u0BABல்னா\u0BA1 பிந ச\u0BA5ாழிகள் 10% ப\u0BA5ல் உதப\u0BA6ாகிக்கக் கூடாது\n" +
                "• \u0BA1ங்களின் கந\u0BA1\u0BACசணத்ந\u0BA1 (script) 18/03/2018 ஆம் ப\u0BA1திக்குள்\n" +
                "sts1330@gmail.com என்ந மின்ணஞ்சல் முக\u0BACரிக்கு அனுப்தவும்.\n" +
                "• \u0BA2டு\u0BACர்களின் தீர்ப்பத இறுதி\u0BA6ாணது. ");
     ev56d.put("contact","\u0BA7ாஜ\u0BA7ாஜன்: 9962908896\n" +
             "ஹரிணி: 9884242165");

        Map<String,String> ev57d = new HashMap<>();
        ev57d.put("desc","\"\u0BA5ாறு\u0BA1ல்கள் சசய்\u0BAC\u0BA1ற்பகா \u0BA5க்கநப \u0BA5கிழ்விப்த\u0BA1ற்பகா \u0BACார்த்\u0BA1நகள்\n" +
                "ப\u0BA1ந\u0BACயில்நன\".\n" +
                "இநசத் ப\u0BA1ா\u0BABனின் உ\u0BA1விப\u0BA6ாடு உங்கள் எண்\u0BA0ச்சா\u0BA7ல்கநப எங்கள் முன் சித்\u0BA1ரிக்க\n" +
                "\u0BACாருங்கள்”\n");
        ev57d.put("rules","\uF0B7 ஓர் அணிக்கு 6 - 8 \u0BA2தர்கள் இருக்கனாம்.\n" +
                "\uF0B7 அணிக்கு 6-8 \u0BA5ணித்துளிகள் சகாடுக்கப்தடும்.\n" +
                "\uF0B7 இநச, ததிவு சசய்\u0BA6ப்தட்ட\u0BA1ாகப\u0BACா \u0BACாத்தி\u0BA6 இநச\u0BA6ாகப\u0BACா இருக்கனாம்.\n" +
                "\uF0B7 அணியிணர் அநண\u0BACரும் ஒப\u0BA7 வி\u0BA1\u0BA5ாண உநட \u0BA5ற்றும் முகச்சா\u0BA6த்தில் இருக்க\n" +
                "ப\u0BACண்டும்.\n" +
                "\uF0B7 அணியின் முகச்சா\u0BA6ல் முகச\u0BA5ாழியின் ந\u0BA5\u0BA6க்கருத்ந\u0BA1 ச\u0BACளிப்தடுத்\u0BA1ா\n" +
                "\u0BACண்\u0BA0ம் அந\u0BA5\u0BA1ல் ப\u0BACண்டும்.\n" +
                "\uF0B7 அணியிணர் அநண\u0BACரும் நகயுநநகளும் காலுநநகளும் அணிந்திருக்க\n" +
                "ப\u0BACண்டும்.\n" +
                "\uF0B7 சிநப்புப் சதாருட்கநப ப\u0BA5நடயில் த\u0BA6ன்தடுத்\u0BA1 அனு\u0BA5தி இல்நன.\n" +
                "\uF0B7 விபக்கப் தடங்கள் த\u0BA6ன்தடுத்\u0BA1க் கூடாது.\n" +
                "\uF0B7 எவ்வி\u0BA1க் கு\u0BA7ல் ஒலிந\u0BA6யும் த\u0BA6ன்தடுத்\u0BA1 அனு\u0BA5தி இல்நன.\n" +
                "\uF0B7 அந\u0BACக்குப் சதாருந்\u0BA1ா\u0BA1 சசய்நககள் கட்டா\u0BA6\u0BA5ாகத் \u0BA1விர்க்கப்தட ப\u0BACண்டும்.\n" +
                "\uF0B7 \u0BA2டு\u0BACர்களின் முடிப\u0BAC இறுதி\u0BA6ாணது.");
     ev57d.put("contact","ககஷினி: 9952135325\n" +
             " வீ\u0BA0ா:9442683857");

        Map<String,String> ev58d = new HashMap<>();
        ev58d.put("desc","\"முகம் \u0BA5நநத்து\n" +
                "ச\u0BA5ௌணத்தில் சசால்னாடி\n" +
                "ரூத அரூதமு\u0BA5ாகி\n" +
                "நின்பநன் \u0BA6ாது\u0BA5ாகி\"");
        ev58d.put("rules","\uF0B7 \u0BA1னி \u0BA2தர் தங்பகற்கும் பதாட்டி.\n" +
                "\uF0B7 \u0BA1குதிச்சுற்றுக்கு 2 நிமிடங்கள் \u0BAC\u0BABங்கப்தடும்.\n" +
                "\uF0B7 இரு தகுதிகபாக \u0BA1குதிச்சுற்று அந\u0BA5யும்.\n" +
                "\uF0B7 மு\u0BA1ல் தகுதியில் பதாட்டி\u0BA6பர்கள் \u0BA1ாம் \u0BA1\u0BA6ார் சசய்\u0BA1 \u0BA2ாடகத்ந\u0BA1 \u0BA2டித்துக்\n" +
                "காட்ட ப\u0BACண்டும்.\n" +
                "\uF0B7 இ\u0BA7ண்டாம் தகுதி தற்றி\u0BA6 வி\u0BAC\u0BA7ம் நிகழ்விடத்தில் அறிவுறுத்\u0BA1ப்தடும்.\n" +
                "\uF0B7 \u0BA1குதிச்சுற்றின் மூனம் பதாட்டி\u0BA6ாபர்கள் ப\u0BA1ர்வுசசய்\u0BA6ப்தடு\u0BACார்கள்.\n" +
                "\uF0B7 விபக்கப் தடங்கள் த\u0BA6ன்தடுத்\u0BA1க்கூடாது.\n" +
                "\uF0B7 கு\u0BA7சனாலி கன\u0BACா\u0BA1 இநசந\u0BA6ப் த\u0BA6ன்தடுத்\u0BA1 \u0BA5ட்டுப\u0BA5 அனு\u0BA5தி உண்டு.\n" +
                "\uF0B7 சீ\u0BA7ாண உநட, முகச்சா\u0BA6ம், நகயுநந, காலுநந அணிந்திருத்\u0BA1ல் அ\u0BACசி\u0BA6ம்.\n" +
                "\uF0B7 அந\u0BACக்குப் சதாருந்\u0BA1ா\u0BA1 சசய்நககள் ஏற்றுக்சகாள்பப்தட\u0BA5ாட்டா.\n" +
                "\uF0B7 \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணது.\n" +
                " ");
     ev58d.put("contact","\u0BA1ாரிணி:8903576352\n" +
             "வீ\u0BA0ா:9442683857");

        Map<String,String> ev59d = new HashMap<>();
        ev59d.put("desc","\"\u0BACட்டா\u0BA7 \u0BACழிகளிபன \u0BACற்நா\u0BA1 \u0BA1மிழ் பதசி\n" +
                "அ\u0BA7சி\u0BA6லின் விழிகளிபன அறிவி\u0BA6ல் கநன பூசி\n" +
                "அறிவு சதற்நாலும் புகழ் தண்தாட்டில்\u0BA1ான் - எண\n" +
                "தா\u0BA5\u0BA7னும் சா\u0BA5\u0BA7ம் வீசும் சாஸ்த்\u0BA7ாவின் கூத்துப்தட்டறந இது !\" ");
        ev59d.put("rules","\uF0B7 ஒவ்ச\u0BACாரு அணிக்கும் \u0BA1னா 15 நிமிடங்கள் \u0BAC\u0BABங்கப்தடும்\n" +
                "\uF0B7 அணிக்கு அதிகதட்ச\u0BA5ாக 12 பதர் \u0BACந\u0BA7 இருக்கனாம்\n" +
                "\uF0B7 மின் இநசக்கருவிகள் அனு\u0BA5திக்கப்தட\u0BA5ாட்டாது\n" +
                "\uF0B7 சினி\u0BA5ா தாடல் சா\u0BA6லில் கூத்து தாடல் இருப்தந\u0BA1 \u0BA1விர்க்கவும்\n" +
                "\uF0B7 கருத்தின் ச\u0BA1ளிவு, சமு\u0BA1ா\u0BA6 பி\u0BA7ச்சநணகளுக்காண தீர்வு ,அணியின் ஒத்தி\u0BA6க்கம்,\n" +
                "\u0BA1னித்\u0BA1ன்ந\u0BA5, குழுவிணரின் தங்களிப்பு பதான்ந\u0BACற்றின் அடிப்தநடயில் தீர்ப்பு\n" +
                "அந\u0BA5யும்\n" +
                "\uF0B7 அணியிணர் அநண\u0BACரும் ஒப\u0BA7 வி\u0BA1\u0BA5ாண உநடயில் இருக்க ப\u0BACண்டும்\n" +
                "\uF0B7 \u0BACன்\u0BA5மும், ஈணத்\u0BA1ன்ந\u0BA5யும் முற்றிலு\u0BA5ாகத் \u0BA1விர்க்கப்தட ப\u0BACண்டும்\n" +
                "\uF0B7 \u0BA1ண்ணீர் \u0BA5ற்றும் ச\u0BA2ருப்பு ப\u0BA5நடயில் த\u0BA6ன்தடுத்\u0BA1க் கூடாது\n" +
                "\uF0B7 \u0BA2டு\u0BACர்களின் தீர்ப்பத இறுதி\u0BA6ாணத");
     ev59d.put("contact","பி\u0BA7வீன் கு\u0BA5ார்: 8124829708\n" +
             "பி\u0BA7கதீஸ்: 8122545606");

        Map<String,String> ev60d = new HashMap<>();
        ev60d.put("desc","“தாத்தி\u0BA7த்தின் \u0BACடி\u0BAC\u0BA5ாகும் நீர் பதான க\u0BA1ாதாத்தி\u0BA7த்ந\u0BA1ப் தடி\u0BACங்சகாண்டு நீர்\n" +
                "\u0BA1ன்ணந்\u0BA1னிப\u0BA6 \u0BA5கா\u0BA7ாஜ்ஜி\u0BA6த்ந\u0BA1 ஆட்டிப்தநடக்க அந\u0BABக்கிபநாம்!”\n");
        ev60d.put("rules","\uF0B7 கான அ\u0BACகாசம்: 6-8 நிமிடங்கள்\n" +
                "\uF0B7 \u0BA1னி ச\u0BA5ாழி\u0BA6ாக இருக்கனாம் அல்னது \u0BA1னி \u0BA2டிப்தாக இருக்கனாம்.( Monologue or\n" +
                "Monoact)\n" +
                "\uF0B7 அதாச ச\u0BA5ாழிப\u0BA6ா சகாச்நசப் தடுத்தும்தடி\u0BA6ாண சசாற்கநபப\u0BA6ா\n" +
                "த\u0BA6ன்தடுத்\u0BA1க் கூடாது.\n" +
                "\uF0B7 \u0BA1மிந\u0BAB \u0BA1விர்த்து பிந ச\u0BA5ாழிகநப 10 % ப\u0BA5ல் உதப\u0BA6ாகிக்கா\u0BA5ல்\n" +
                "இருக்கப\u0BACண்டும்.\n" +
                "\uF0B7 ப\u0BA5நடயிலிருந்து நீங்கள் உதப\u0BA6ாகித்\u0BA1 சதாருட்கநபச\u0BA6ல்னாம்\n" +
                "இநக்கிவிடப\u0BACண்டும்.\n" +
                "\uF0B7 ப\u0BA5நடயின் மீது ச\u0BA2ருப்பிநண உதப\u0BA6ாகப்தடுத்து\u0BA1ல் கூடாது.\n" +
                "\uF0B7 \u0BA2டு\u0BACர்களின் தீர்ப்பத இறுதி\u0BA6ாணத");
     ev60d.put("contact","ஹரிணி:9884242165\n" +
             "கசஶாத்ரி:8508184683");

        Map<String,String> ev61d = new HashMap<>();
        ev61d.put("desc","“\u0BA2\u0BAC\u0BA7சம் கநடந்ச\u0BA1டுக்க இ\u0BA7ாசணந\u0BA6த் ச\u0BA1ாகுத்து \u0BACசணத்\u0BA1ால் காவி\u0BA6ம் தநடக்க\n" +
                "இனி\u0BA6ச\u0BA1ாரு \u0BA1னி \u0BA2நடயில் இ\u0BA0\u0BA6 \u0BACாருங்கள்!”");
        ev61d.put("rules","\uF0B7 உங்கள் \u0BA2ாடகம் 25 நிமிடங்களுக்குள் முடியு\u0BA5ாறு எழு\u0BA1ப\u0BACண்டும் (30\n" +
                "தக்கங்களுக்குள் எழுது\u0BACது சிநந்\u0BA1து)\n" +
                "\uF0B7 குழுவில் 10+2 \u0BA2தர்கள் இருக்கனாம்.(Cast+crew)\n" +
                "\uF0B7 அதாச ச\u0BA5ாழிப\u0BA6ா சகாச்நசப் தடுத்தும்தடி\u0BA6ாண சசாற்கநபப\u0BA6ா\n" +
                "த\u0BA6ன்தடுத்\u0BA1க் கூடாது.\n" +
                "\uF0B7 \u0BA1மிந\u0BAB \u0BA1விர்த்து பிந ச\u0BA5ாழிகநப 10 % ப\u0BA5ல் உதப\u0BA6ாகிக்கக் கூடாது.\n" +
                "\uF0B7 உங்கள் \u0BACசணகாவி\u0BA6த்ந\u0BA1 sts1330@gmail.com என்ந மின்ணஞ்சல் முக\u0BACரிக்பகா\n" +
                "அல்னது ப\u0BA2ரிபனா 24/03/2018 அன்று சகாடுக்கனாம்.\n" +
                "\uF0B7 \u0BA2டு\u0BACரின் தீர்ப்பத இறுதி\u0BA6ாணது.\n");
     ev61d.put("contact","ஹரிணி: 9884242165\n" +
             "\u0BA7ாஜ\u0BA7ாஜன்: 9962908896");

        TamList.put("DEBATE",ev47d);
        TamList.put("TAMIL QUIZ",ev48d);
        TamList.put("CREATIVE WRITING",ev49d);
        TamList.put("POEM WRITING",ev50d);
        TamList.put("CINEQUIZ",ev51d);
        TamList.put("SONGS QUIZ",ev52d);
        TamList.put("DUMB CHARADES",ev53d);
        TamList.put("POT POURRI",ev54d);
        TamList.put("KPY",ev55d);
        TamList.put("DRAMA",ev56d);
        TamList.put("MIME",ev57d);
        TamList.put("SOLOMIME",ev58d);
        TamList.put("VASANAKAVIYAM",ev60d);
        TamList.put("RAJAPAT",ev61d);
        TamList.put("STREETPLAY",ev59d);



        masterList.put("300dpi",dpiList);
        masterList.put("Tamizh Sangam",TamList);
        masterList.put("Hindi Lits",HList);
        masterList.put("English Literary Society",EList);
        masterList.put("Telugu Lits",TelList);
        masterList.put("The Studio",StuList);
        masterList.put("Arts",ArtList);
        masterList.put("Eastern Dance Team",EastList);
        masterList.put("Western Dance Team",WestList);
        masterList.put("SASTRA Music Team",SMTList);
        masterList.put("SASTRA Fotohub",SFHList);






        return masterList;

    }

    public static Map<String,String> getEventDescription(String cluster, String event){

        return masterList.get(cluster).get(event);
    }

    public static Map<String, List<Event>> getAllEvents(){
        Map<String, List<Event>> map = new HashMap<>();

//       Initialize individual cluster lists to add events later
        List<Event> design = new ArrayList<>();
        List<Event> elits = new ArrayList<>();
        List<Event> hlits = new ArrayList<>();
        List<Event> tamlits = new ArrayList<>();
        List<Event> studio = new ArrayList<>();
        List<Event> arts = new ArrayList<>();
        List<Event> east = new ArrayList<>();
        List<Event> west = new ArrayList<>();
        List<Event> smt = new ArrayList<>();
        List<Event> tellits = new ArrayList<>();
     List<Event> sfh = new ArrayList<>();


        // Add Events to each cluster


     //sfh
     /*SFHList.put("Salle De Cinema",ev100d);
     SFHList.put("Online Photography Event",ev101d);*/
     sfh.add(new Event("Salle De Cinema",1));
     sfh.add(new Event("Online Photography Event",1));

        //300dpi
        design.add(new Event("Photo Synthesis",1));
        design.add(new Event("Kinetic Typography",1));


        //ELits
        /*EList.put("Ganimetoonic Quiz",ev3d);
        EList.put("India Quiz",ev4d);
        EList.put("What's The Good Word",ev5d);
        EList.put("Crossword",ev6d);
        EList.put("Scrabble",ev7d);
        EList.put("Dumb Charades",ev8d);
        EList.put("Potpourri",ev9d);
        EList.put("Just A Minute",ev10d);
        EList.put("Extempore",ev11d);
        EList.put("Debate",ev12d);
        EList.put("The Gen Quiz",ev13d);
        EList.put("Spentech Quiz",ev14d);*/

        elits.add(new Event("Ganimetoonic Quiz",2));
        elits.add(new Event("India Quiz",3));
        elits.add(new Event("What's The Good Word",2));
        elits.add(new Event("Crossword",2));
        elits.add(new Event("Scrabble",2));
        elits.add(new Event("Dumb Charades",3));
        elits.add(new Event("Potpourri",4));
        elits.add(new Event("Just A Minute",1));
        elits.add(new Event("Extempore",1));
        elits.add(new Event("Debate",2));
        elits.add(new Event("The Gen Quiz",3));
        elits.add(new Event("Spentech Quiz",3));



        //HLits

        /*HList.put("Antakshari",ev15d);
        HList.put("Dramebaaz",ev16d);
        HList.put("Dumc - Barfi",ev17d);
        HList.put("Debate - Amne Samne",ev18d);
        HList.put("India Quiz",ev19d);
        HList.put("Monoacting - Nautanki Saala",ev20d);
        HList.put("Extempore - Bas Ek Pal",ev21d);
        HList.put("Fun Events",ev22d);*/

        hlits.add(new Event("Antakshari",2));
        hlits.add(new Event("Dramebaaz",9));
        hlits.add(new Event("Dumc - Barfi",3));
        hlits.add(new Event("Debate - Amne Samne",3));
        hlits.add(new Event("India Quiz",2));
        hlits.add(new Event("Monoacting - Nautanki Saala",1));
        hlits.add(new Event("Extempore - Bas Ek Pal",1));
        hlits.add(new Event("Fun Events",2));

        //Tamil Lits
     /* TamList.put("DEBATE",ev47d);
        TamList.put("TAMIL QUIZ",ev48d);
        TamList.put("CREATIVE WRITING",ev49d);
        TamList.put("POEM WRITING",ev50d);
        TamList.put("CINEQUIZ",ev51d);
        TamList.put("SONGS QUIZ",ev52d);
        TamList.put("DUMB CHARADES",ev53d);
        TamList.put("POT POURRI",ev54d);
        TamList.put("KPY",ev55d);
        TamList.put("DRAMA",ev56d);
        TamList.put("MIME",ev57d);
        TamList.put("SOLOMIME",ev58d);
        TamList.put("VASANAKAVIYAM",ev60d);
        TamList.put("RAJAPAT",ev61d);
        TamList.put("STREETPLAY",ev59d);*/
        tamlits.add(new Event("DEBATE",1));
        tamlits.add(new Event("TAMIL QUIZ\"",1));
     tamlits.add(new Event("CREATIVE WRITING",1));
     tamlits.add(new Event("POEM WRITING",1));
     tamlits.add(new Event("CINEQUIZ",1));
     tamlits.add(new Event("SONGS QUIZ",1));
     tamlits.add(new Event("DUMB CHARADES",1));
     tamlits.add(new Event("POT POURRI",1));
     tamlits.add(new Event("KPY",1));
     tamlits.add(new Event("DRAMA",1));
     tamlits.add(new Event("MIME",1));
     tamlits.add(new Event("SOLOMIME",1));
     tamlits.add(new Event("VASANAKAVIYAM",1));
     tamlits.add(new Event("RAJAPAT",1));
     tamlits.add(new Event("STREETPLAY",1));

        //Studio
     /*StuList.put("Act Play",ev34d);
        StuList.put("Mono Acting",ev35d);
        StuList.put("Improv Event",ev36d);*/
        studio.add(new Event("Act Play",12));
        studio.add(new Event("Mono Acting",1));
     studio.add(new Event("Improv Event",4));

        //Arts
        arts.add(new Event("Shadow Art",3));
        arts.add(new Event("Face tatoo Making",2));
        arts.add(new Event("Relay Art",2));
        arts.add(new Event("Hall of Fame",1));

        /*ArtList.put("Shadow Art",ev43d);
        ArtList.put("Face tatoo Making",ev44d);
        ArtList.put("Relay Art",ev45d);
        ArtList.put("Hall of Fame",ev46d);*/

        //East
     /*EastList.put("Choreonite", ev23d);
     EastList.put("Nrithya Madhuryam",ev24d);
     */
        east.add(new Event("Choreonite",25));
        east.add(new Event("Nrithya Madhuryam",1));

        //West
        /*WestList.put("Dual Trio",ev31d);
        WestList.put("Solo Dance",ev32d);
        WestList.put("Choreo Night",ev33d);*/

        west.add(new Event("Dual Trio",3));
        west.add(new Event("Solo Dance",1));
        west.add(new Event("Choreo Night",30));


        //SMT
     /*SMTList.put("Eastern Band Event",ev25d);
        SMTList.put("KS Idol",ev26d);
        SMTList.put("Carnatic Solo vocal",ev27d);
        SMTList.put("Western Solo Vocal",ev28d);
        SMTList.put("Instrumental: Eastern",ev29d);
        SMTList.put("Instrumental: Western",ev30d);*/

        smt.add(new Event("Eastern Band Event",2));
        smt.add(new Event("KS Idol",1));
        smt.add(new Event("Carnatic Solo vocal",1));
        smt.add(new Event("Western Solo Vocal",1));
        smt.add(new Event("Instrumental: Eastern",1));
     smt.add(new Event("Instrumental: Western",1));

        //Tel Lits
     /* TelList.put("Pataku Pranam Pallavi Aithe",ev37d);
        TelList.put("Rangasthalamr",ev38d);
        TelList.put("Oke okka Chance",ev39d);
        TelList.put("Evadi Gola Vadidhi",ev40d);
        TelList.put("Mr Medhavi",ev41d);
        TelList.put("Treasure hunt",ev42d);*/
        tellits.add(new Event("Pataku Pranam \nPallavi Aithe",3));
        tellits.add(new Event("Rangasthalamr",10));
     tellits.add(new Event("Oke okka Chance",3));
     tellits.add(new Event("Evadi Gola Vadidhi",3));
     tellits.add(new Event("Mr Medhavi",3));
     tellits.add(new Event("Treasure hunt",3));


        map.put("300dpi",design);
        map.put("Tamizh Sangam",tamlits);
        map.put("Hindi Lits",hlits);
        map.put("English Literary Society",elits);
        map.put("Telugu Lits",tellits);
        map.put("The Studio",studio);
        map.put("Arts",arts);
        map.put("Eastern Dance Team",east);
        map.put("Western Dance Team",west);
        map.put("SASTRA Music Team",smt);

        return map;
    }

    public static void change(String cat){
        recyclerView.setAdapter(new EventsAdapter(ctx,getEventsList(cat,listEvents),cat));
        title.setText(cat);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
