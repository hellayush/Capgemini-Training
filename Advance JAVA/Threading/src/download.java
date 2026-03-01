import java.util.ArrayList;
import java.util.List;

class downloader extends Thread {

    String image;

    downloader(String image) {
        this.image = image;
    }

    public void run() {
        download(image);
    }

    public void download(String image) {
        try {
            System.out.println("Downloading " + image + "...");
            Thread.sleep(2000);
            System.out.println(image + " downloaded");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class download {

    public static void main(String[] args) throws InterruptedException {

        String images[] = {"image1", "image2", "image3"};
        List<Thread> list = new ArrayList<>();

        for (int i = 0; i < images.length; i++) {
            downloader loader = new downloader(images[i]);
            list.add(loader);
            loader.start();
        }
        for(Thread t : list)
        {
            t.join(); // one by one execute and (one thread at a time )
        }
    }
}