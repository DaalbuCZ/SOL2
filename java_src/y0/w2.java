package y0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class w2 {

    /* renamed from: a  reason: collision with root package name */
    private final URL f16753a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16754b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16755c;

    public w2(URL url, String str, String str2) {
        this.f16753a = url;
        this.f16754b = str;
        this.f16755c = str2;
    }

    private String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (-1 == read) {
                bufferedReader.close();
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public String b(String str, String str2) {
        return c(str, str2, -1L);
    }

    public String c(String str, String str2, long j10) {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f16753a, str).openConnection()));
                try {
                    try {
                        httpURLConnection.setRequestProperty("User-Agent", "bugfender-android/" + this.f16754b);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDefaultUseCaches(false);
                        httpURLConnection.setChunkedStreamingMode(0);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(20L));
                        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(60L));
                        httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
                        httpURLConnection.setRequestProperty("X-App-Token", this.f16755c);
                        if (j10 != -1) {
                            httpURLConnection.setRequestProperty("X-App-Session", String.valueOf(j10));
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        bufferedOutputStream.write(str2.getBytes());
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 > responseCode || responseCode > 299) {
                            String responseMessage = httpURLConnection.getResponseMessage();
                            String a10 = a(httpURLConnection.getErrorStream());
                            throw new j2(1, "Error status: " + responseCode + " / Response Message: " + responseMessage + " / Error Body: " + a10);
                        }
                        return a(httpURLConnection.getInputStream());
                    } finally {
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e10) {
                    String message = e10.getMessage();
                    if (message == null || !message.contains("EPERM (Operation not permitted)")) {
                        throw new j2(1, "IO Exception: " + message);
                    }
                    throw new j2(0, "IO Exception: " + message);
                }
            } catch (IOException e11) {
                throw new j2(1, "IO Exception: " + e11.getMessage());
            }
        } catch (MalformedURLException e12) {
            throw new RuntimeException(e12);
        }
    }
}
