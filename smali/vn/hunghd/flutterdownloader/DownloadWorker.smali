.class public final Lvn/hunghd/flutterdownloader/DownloadWorker;
.super Landroidx/work/Worker;
.source ""

# interfaces
.implements Ll8/k$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn/hunghd/flutterdownloader/DownloadWorker$a;,
        Lvn/hunghd/flutterdownloader/DownloadWorker$b;
    }
.end annotation


# static fields
.field public static final O:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

.field private static final P:Ljava/lang/String;

.field private static final Q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final R:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static S:Lio/flutter/embedding/engine/a;

.field private static final T:Ljavax/net/ssl/HostnameVerifier;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private E:I

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private K:Ljava/lang/String;

.field private L:J

.field private M:I

.field private N:Z

.field private final t:Ljava/util/regex/Pattern;

.field private final u:Ljava/util/regex/Pattern;

.field private final v:Ljava/util/regex/Pattern;

.field private w:Ll8/k;

.field private x:Lca/k;

.field private y:Lca/j;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;-><init>(Lk9/g;)V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->O:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    const-class v0, Lvn/hunghd/flutterdownloader/DownloadWorker;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->R:Ljava/util/ArrayDeque;

    sget-object v0, Lca/f;->a:Lca/f;

    sput-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->T:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p2, "(?i)\\bcharset=\\s*\"?([^\\s;\"]*)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename\\*=([^\']+)\'([^\']*)\'\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Ljava/util/regex/Pattern;

    const-string p2, "(?i)\\bfilename=\"?([^\"]+)\"?"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Ljava/util/regex/Pattern;

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lca/d;

    invoke-direct {v0, p0, p1}, Lca/d;-><init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 27

    move-object/from16 v8, p0

    move-object/from16 v1, p3

    move-object/from16 v9, p4

    move/from16 v2, p7

    const-string v10, "id.toString()"

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    iget-object v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v4, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lca/c;->g()I

    move-result v4

    iput v4, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_a
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :cond_1
    const-wide/16 v4, 0x0

    move-object/from16 v6, p2

    const/4 v7, 0x0

    :goto_1
    :try_start_1
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    const/4 v15, 0x1

    if-nez v12, :cond_2

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v3, v6, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v12, v15

    goto :goto_2

    :cond_2
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lk9/k;->b(Ljava/lang/Object;)V

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    add-int/2addr v12, v15

    :goto_2
    const/4 v13, 0x3

    if-gt v12, v13, :cond_2b

    new-instance v12, Ljava/net/URL;

    invoke-direct {v12, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iget-boolean v13, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const-string v14, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    if-eqz v13, :cond_6

    :try_start_2
    sget-object v13, Lvn/hunghd/flutterdownloader/DownloadWorker;->O:Lvn/hunghd/flutterdownloader/DownloadWorker$a;

    invoke-static {v13}, Lvn/hunghd/flutterdownloader/DownloadWorker$a;->a(Lvn/hunghd/flutterdownloader/DownloadWorker$a;)V

    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v13

    const-string v11, "resourceUrl.protocol"

    invoke-static {v13, v11}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v15, "US"

    invoke-static {v11, v15}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v13, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v11, v13}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "https"

    invoke-static {v11, v13}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v11

    invoke-static {v11}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/net/URLConnection;

    if-eqz v11, :cond_3

    check-cast v11, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v12, Lvn/hunghd/flutterdownloader/DownloadWorker;->T:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v11, v12}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v14}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v11

    invoke-static {v11}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/net/URLConnection;

    if-eqz v11, :cond_5

    check-cast v11, Ljava/net/HttpURLConnection;

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v11

    invoke-static {v11}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/net/URLConnection;

    if-eqz v11, :cond_2a

    check-cast v11, Ljavax/net/ssl/HttpsURLConnection;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :goto_3
    :try_start_3
    const-string v7, "Open connection to "

    invoke-static {v7, v6}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    invoke-virtual {v11, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v12, "User-Agent"

    const-string v13, "Mozilla/5.0..."

    invoke-virtual {v11, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v12, p5

    invoke-direct {v8, v11, v12}, Lvn/hunghd/flutterdownloader/DownloadWorker;->M(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    if-eqz p6, :cond_7

    invoke-direct {v8, v11, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->O(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4

    :cond_7
    move-wide/from16 v19, v4

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v13

    const/16 v4, 0x133

    if-eq v13, v4, :cond_29

    const/16 v4, 0x134

    if-eq v13, v4, :cond_29

    packed-switch v13, :pswitch_data_0

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_8
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v2, 0xc8

    const-string v21, "Download canceled"

    if-eq v13, v2, :cond_8

    if-eqz p6, :cond_22

    const/16 v2, 0xce

    if-ne v13, v2, :cond_22

    :cond_8
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v2

    if-nez v2, :cond_22

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v5

    const-string v2, "httpConn.contentType"

    invoke-static {v5, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_9

    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getContentLengthLong()J

    move-result-wide v2

    goto :goto_4

    :cond_9
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v2

    int-to-long v2, v2

    :goto_4
    move-wide/from16 v22, v2

    const-string v2, "Content-Type = "

    invoke-static {v2, v5}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    const-string v2, "Content-Length = "

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    invoke-direct {v8, v5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Charset = "

    invoke-static {v3, v2}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    if-nez p6, :cond_f

    if-nez v9, :cond_f

    const-string v3, "Content-Disposition"

    invoke-virtual {v11, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Content-Disposition = "

    invoke-static {v4, v3}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    if-eqz v3, :cond_b

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    move v4, v7

    goto :goto_6

    :cond_b
    :goto_5
    const/4 v4, 0x1

    :goto_6
    if-nez v4, :cond_c

    invoke-direct {v8, v3, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    :cond_c
    if-eqz v9, :cond_e

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_d

    goto :goto_7

    :cond_d
    move v2, v7

    goto :goto_8

    :cond_e
    :goto_7
    const/4 v2, 0x1

    :goto_8
    if-eqz v2, :cond_f

    const-string v13, "/"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v2, 0x6

    const/16 v17, 0x0

    move-object v12, v6

    const/4 v3, 0x1

    move/from16 v16, v2

    invoke-static/range {v12 .. v17}, Lq9/d;->B(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v3

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "this as java.lang.String).substring(startIndex)"

    invoke-static {v2, v4}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    const-string v4, "UTF-8"

    invoke-static {v2, v4}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v13, v0

    move-object v9, v2

    goto/16 :goto_1f

    :catch_1
    move-exception v0

    move-object v4, v0

    :try_start_6
    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_9
    move-object v9, v2

    goto :goto_a

    :cond_f
    const/4 v3, 0x1

    :goto_a
    :try_start_7
    const-string v2, "fileName = "

    invoke-static {v2, v9}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    iget-object v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v2, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4, v9, v5}, Lca/j;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Ly8/s;->a:Ly8/s;

    :goto_b
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v12
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/16 v13, 0x1d

    if-eqz p6, :cond_11

    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    move-object v14, v1

    move-object v15, v2

    goto :goto_c

    :cond_11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v13, :cond_12

    iget-boolean v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Z

    if-eqz v2, :cond_12

    invoke-direct {v8, v9, v5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->z(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->E(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "w"

    invoke-virtual {v3, v1, v4}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1

    move-object v15, v1

    move-object v14, v2

    goto :goto_c

    :cond_12
    invoke-static {v9}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-direct {v8, v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object v14, v2

    move-object v15, v3

    :goto_c
    :try_start_9
    new-instance v6, Lk9/q;

    invoke-direct {v6}, Lk9/q;-><init>()V

    const/16 v1, 0x1000

    new-array v4, v1, [B

    move-wide/from16 v1, v19

    :goto_d
    invoke-virtual {v12, v4}, Ljava/io/InputStream;->read([B)I

    move-result v3

    iput v3, v6, Lk9/q;->n:I

    sget-object v16, Ly8/s;->a:Ly8/s;

    const/4 v13, -0x1

    const/16 v7, 0x64

    if-eq v3, v13, :cond_16

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v3

    if-nez v3, :cond_16

    iget v3, v6, Lk9/q;->n:I

    move-object/from16 p5, v5

    move-object/from16 p3, v6

    int-to-long v5, v3

    add-long v24, v1, v5

    int-to-long v1, v7

    mul-long v1, v1, v24

    add-long v5, v22, v19

    div-long/2addr v1, v5

    long-to-int v5, v1

    const/4 v13, 0x0

    if-nez v15, :cond_13

    goto :goto_e

    :cond_13
    invoke-virtual {v15, v4, v13, v3}, Ljava/io/OutputStream;->write([BII)V

    :goto_e
    iget v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    if-eqz v1, :cond_14

    iget v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->M:I

    add-int/2addr v2, v1

    if-gt v5, v2, :cond_14

    if-ne v5, v7, :cond_15

    :cond_14
    if-eq v5, v1, :cond_15

    iput v5, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lca/a;->p:Lca/a;

    invoke-virtual {v1, v2, v6, v5}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    const/4 v7, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-object/from16 v17, v4

    move-object v4, v6

    move-object/from16 v6, p5

    move-object/from16 v26, p3

    move-object v13, v6

    move-object v6, v7

    move/from16 v7, v16

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    goto :goto_f

    :cond_15
    move-object/from16 v26, p3

    move-object/from16 v13, p5

    move-object/from16 v17, v4

    :goto_f
    move-object v5, v13

    move-object/from16 v4, v17

    move-wide/from16 v1, v24

    move-object/from16 v6, v26

    const/4 v7, 0x0

    const/16 v13, 0x1d

    goto :goto_d

    :cond_16
    move-object v13, v5

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v1, :cond_17

    const/4 v1, 0x0

    goto :goto_10

    :cond_17
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v1

    :goto_10
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lca/c;->h()Z

    move-result v2

    if-eqz v2, :cond_18

    iget v2, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    move v5, v2

    goto :goto_11

    :cond_18
    move v5, v7

    :goto_11
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lca/c;->h()Z

    move-result v1

    if-eqz v1, :cond_19

    sget-object v1, Lca/a;->t:Lca/a;

    goto :goto_12

    :cond_19
    sget-object v1, Lca/a;->s:Lca/a;

    goto :goto_12

    :cond_1a
    sget-object v1, Lca/a;->q:Lca/a;

    :goto_12
    move-object v4, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v1, v2}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    sget-object v2, Lca/a;->q:Lca/a;

    if-ne v4, v2, :cond_20

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1b

    invoke-direct {v8, v13}, Lvn/hunghd/flutterdownloader/DownloadWorker;->H(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-direct {v8, v14}, Lvn/hunghd/flutterdownloader/DownloadWorker;->G(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-direct {v8, v13}, Lvn/hunghd/flutterdownloader/DownloadWorker;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v9, v14, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1b
    iget-boolean v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v3, :cond_20

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1d

    if-eqz v1, :cond_1d

    if-eqz v15, :cond_1c

    invoke-virtual {v15}, Ljava/io/OutputStream;->flush()V

    :try_start_a
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_13

    :catch_2
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_1c
    :goto_13
    :try_start_b
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3

    goto :goto_14

    :catch_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :goto_14
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    :cond_1d
    :try_start_c
    sget-object v1, Lca/h;->a:Lca/h;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v3

    const-string v6, "applicationContext"

    invoke-static {v3, v6}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v14, v13}, Lca/h;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1f

    const-string v3, "Setting an intent to open the file "

    invoke-static {v3, v14}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v3}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_1e

    const/high16 v2, 0x14000000

    goto :goto_15

    :cond_1e
    const/high16 v2, 0x10000000

    :goto_15
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v6, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    move-object v6, v1

    goto :goto_16

    :cond_1f
    const-string v1, "There\'s no application that can open the file "

    invoke-static {v1, v14}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    :cond_20
    const/4 v6, 0x0

    :goto_16
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v4, v5}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v1

    if-eqz v1, :cond_21

    goto :goto_17

    :cond_21
    const-string v21, "File downloaded"

    :goto_17
    move-object/from16 v1, v21

    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto/16 :goto_1c

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v7, v11

    move-object/from16 v18, v12

    move-object v11, v15

    goto/16 :goto_27

    :catch_4
    move-exception v0

    move-object v13, v0

    move-object/from16 v18, v11

    move-object v11, v15

    goto/16 :goto_22

    :catchall_1
    move-exception v0

    move-object v1, v0

    move-object v7, v11

    move-object/from16 v18, v12

    const/4 v11, 0x0

    goto/16 :goto_27

    :catch_5
    move-exception v0

    move-object v13, v0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    goto/16 :goto_22

    :cond_22
    :try_start_d
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lca/c;->h()Z

    move-result v1

    if-eqz v1, :cond_23

    sget-object v1, Lca/a;->t:Lca/a;

    goto :goto_18

    :cond_23
    sget-object v1, Lca/a;->s:Lca/a;

    goto :goto_18

    :cond_24
    sget-object v1, Lca/a;->r:Lca/a;

    :goto_18
    move-object v4, v1

    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    invoke-virtual {v1, v2, v4, v3}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    if-nez v9, :cond_25

    move-object/from16 v3, p2

    goto :goto_19

    :cond_25
    move-object v3, v9

    :goto_19
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->j()Z

    move-result v1

    if-eqz v1, :cond_26

    :goto_1a
    move-object/from16 v1, v21

    goto :goto_1b

    :cond_26
    const-string v1, "Server replied HTTP code: "

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    goto :goto_1a

    :goto_1b
    invoke-direct {v8, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_1c
    if-eqz v15, :cond_27

    invoke-virtual {v15}, Ljava/io/OutputStream;->flush()V

    :try_start_e
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    goto :goto_1d

    :catch_6
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_27
    :goto_1d
    if-eqz v12, :cond_28

    :try_start_f
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7

    goto :goto_1e

    :catch_7
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_28
    :goto_1e
    invoke-virtual {v11}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_26

    :cond_29
    :pswitch_0
    :try_start_10
    const-string v4, "Response with redirection code"

    invoke-direct {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    const-string v4, "Location"

    invoke-virtual {v11, v4}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "httpConn.getHeaderField(\"Location\")"

    invoke-static {v4, v5}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Location = "

    invoke-static {v5, v4}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v8, v5}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v5, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v6

    const-string v4, "next.toExternalForm()"

    invoke-static {v6, v4}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "New url: "

    invoke-static {v4, v6}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    move-object v7, v11

    move-wide/from16 v4, v19

    goto/16 :goto_1

    :catchall_2
    move-exception v0

    move-object v1, v0

    move-object v7, v11

    goto :goto_21

    :catch_8
    move-exception v0

    move-object v13, v0

    :goto_1f
    move-object/from16 v18, v11

    goto :goto_20

    :cond_2a
    :try_start_11
    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1, v14}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2b
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Stuck in redirect loop"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_21

    :catch_9
    move-exception v0

    move-object v13, v0

    move-object/from16 v18, v7

    :goto_20
    const/4 v11, 0x0

    const/4 v12, 0x0

    goto :goto_22

    :catchall_4
    move-exception v0

    move-object v1, v0

    const/4 v7, 0x0

    :goto_21
    const/4 v11, 0x0

    const/16 v18, 0x0

    goto :goto_27

    :catch_a
    move-exception v0

    move-object v13, v0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    :goto_22
    :try_start_12
    iget-object v1, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v1}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lca/a;->r:Lca/a;

    iget v3, v8, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    invoke-virtual {v1, v2, v4, v3}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    if-nez v9, :cond_2c

    move-object/from16 v3, p2

    goto :goto_23

    :cond_2c
    move-object v3, v9

    :goto_23
    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    if-eqz v11, :cond_2d

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_13
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_b

    goto :goto_24

    :catch_b
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_2d
    :goto_24
    if-eqz v12, :cond_2e

    :try_start_14
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_c

    goto :goto_25

    :catch_c
    move-exception v0

    move-object v1, v0

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    :cond_2e
    :goto_25
    if-nez v18, :cond_2f

    goto :goto_26

    :cond_2f
    invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object v1, Ly8/s;->a:Ly8/s;

    :goto_26
    return-void

    :catchall_5
    move-exception v0

    move-object v1, v0

    move-object/from16 v7, v18

    move-object/from16 v18, v12

    :goto_27
    if-eqz v11, :cond_30

    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    :try_start_15
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_d

    goto :goto_28

    :catch_d
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    :cond_30
    :goto_28
    if-eqz v18, :cond_31

    :try_start_16
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_e

    goto :goto_29

    :catch_e
    move-exception v0

    move-object v2, v0

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    :cond_31
    :goto_29
    if-nez v7, :cond_32

    goto :goto_2a

    :cond_32
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object v2, Ly8/s;->a:Ly8/s;

    :goto_2a
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final B(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->t:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_4

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-gt v4, v2, :cond_7

    if-nez v5, :cond_2

    move v6, v4

    goto :goto_1

    :cond_2
    move v6, v2

    :goto_1
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x20

    invoke-static {v6, v7}, Lk9/k;->f(II)I

    move-result v6

    if-gtz v6, :cond_3

    move v6, v1

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    if-nez v5, :cond_5

    if-nez v6, :cond_4

    move v5, v1

    goto :goto_0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_7
    :goto_3
    add-int/2addr v2, v1

    invoke-interface {p1, v4, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string p1, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v0, p1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    :goto_4
    return-object v0
.end method

.method private final C(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, ";"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lq9/d;->L(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_4

    :cond_1
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p1, v2}, Lk9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_4

    :cond_2
    aget-object p1, p1, v1

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    move v3, v1

    move v4, v3

    :goto_0
    if-gt v3, v0, :cond_9

    if-nez v4, :cond_4

    move v5, v3

    goto :goto_1

    :cond_4
    move v5, v0

    :goto_1
    invoke-interface {p1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x20

    invoke-static {v5, v6}, Lk9/k;->f(II)I

    move-result v5

    if-gtz v5, :cond_5

    move v5, v2

    goto :goto_2

    :cond_5
    move v5, v1

    :goto_2
    if-nez v4, :cond_7

    if-nez v5, :cond_6

    move v4, v2

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_9
    :goto_3
    add-int/2addr v0, v2

    invoke-interface {p1, v3, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    return-object v0
.end method

.method private final D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->v:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->u:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    move-object p2, v0

    goto :goto_1

    :cond_2
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {p2, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {p1, p2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p2, p1

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    if-nez p2, :cond_5

    const-string p2, "ISO-8859-1"

    :cond_5
    invoke-static {v1, p2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private final E(Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    const-string v0, "_data"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {p1, v1}, Lh9/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-static {p1, v1}, Lh9/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {p1, v0}, Lh9/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    const-string p1, "Get a path for a MediaStore failed"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->J(Ljava/lang/String;)V

    return-object v1
.end method

.method private final F()I
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    const-string v1, "applicationContext.packa\u2026ATA\n                    )"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "vn.hunghd.flutterdownloader.NOTIFICATION_ICON"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const/4 v0, 0x0

    return v0
.end method

.method private final G(Ljava/lang/String;)Z
    .locals 4

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    const-string v1, "getExternalStorageDirectory()"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "externalStorageDir.path"

    invoke-static {v0, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lq9/d;->k(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final H(Ljava/lang/String;)Z
    .locals 4

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "image/"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, Lq9/d;->k(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "video"

    invoke-static {p1, v1, v0, v2, v3}, Lq9/d;->k(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final I(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:Z

    if-eqz v0, :cond_0

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final J(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:Z

    if-eqz v0, :cond_0

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->P:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final K(Lca/a;I)V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "callback_handle"

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroidx/work/b;->k(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id.toString()"

    invoke-static {v1, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p2, Lvn/hunghd/flutterdownloader/DownloadWorker;->R:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lca/e;

    invoke-direct {v1, p0, v0}, Lca/e;-><init>(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method private static final L(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$args"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Ll8/k;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    invoke-virtual {p0, v0, p1}, Ll8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final M(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const-string v0, "Headers = "

    invoke-static {v0, p2}, Lk9/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    const-string v2, "json.keys()"

    invoke-static {p2, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_2
    :goto_2
    return-void
.end method

.method private final N(Landroid/content/Context;)V
    .locals 5

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lca/i;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "res.getString(R.string.f\u2026otification_channel_name)"

    invoke-static {v1, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lca/i;->b:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "res.getString(R.string.f\u2026tion_channel_description)"

    invoke-static {v0, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-instance v3, Landroid/app/NotificationChannel;

    const-string v4, "FLUTTER_DOWNLOADER_NOTIFICATION"

    invoke-direct {v3, v4, v1, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v3, v0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0, v0}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-static {p1}, Landroidx/core/app/n;->f(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p1

    const-string v0, "from(context)"

    invoke-static {p1, v0}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroidx/core/app/n;->e(Landroid/app/NotificationChannel;)V

    :cond_1
    return-void
.end method

.method private final O(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Resume download: Range: bytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    const-string v0, "Accept-Encoding"

    const-string v2, "identity"

    invoke-virtual {p1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Range"

    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    return-wide p2
.end method

.method private final P(Landroid/content/Context;)V
    .locals 6

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker;->S:Lio/flutter/embedding/engine/a;

    if-nez v1, :cond_3

    const-string v1, "vn.hunghd.downloader.pref"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "context.getSharedPrefere\u2026PRIVATE\n                )"

    invoke-static {p1, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback_dispatcher_handle_key"

    const-wide/16 v3, 0x0

    invoke-interface {p1, v1, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    new-instance p1, Lio/flutter/embedding/engine/a;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v5, 0x0

    invoke-direct {p1, v1, v5, v2}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;Z)V

    sput-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->S:Lio/flutter/embedding/engine/a;

    invoke-static {v3, v4}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Fatal: failed to find callback"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lx7/a;->e()Lx7/a;

    move-result-object v1

    invoke-virtual {v1}, Lx7/a;->c()La8/f;

    move-result-object v1

    invoke-virtual {v1}, La8/f;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "instance().flutterLoader().findAppBundlePath()"

    invoke-static {v1, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    sget-object v3, Lvn/hunghd/flutterdownloader/DownloadWorker;->S:Lio/flutter/embedding/engine/a;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lio/flutter/embedding/engine/a;->h()Ly7/a;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v4, Ly7/a$b;

    invoke-direct {v4, v2, v1, p1}, Ly7/a$b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;Lio/flutter/view/FlutterCallbackInformation;)V

    invoke-virtual {v3, v4}, Ly7/a;->j(Ly7/a$b;)V

    :cond_3
    :goto_0
    sget-object p1, Ly8/s;->a:Ly8/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    new-instance p1, Ll8/k;

    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->S:Lio/flutter/embedding/engine/a;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->h()Ly7/a;

    move-result-object v0

    const-string v1, "vn.hunghd/downloader_background"

    invoke-direct {p1, v0, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Ll8/k;

    invoke-virtual {p1, p0}, Ll8/k;->e(Ll8/k$c;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V
    .locals 4

    invoke-direct {p0, p3, p4}, Lvn/hunghd/flutterdownloader/DownloadWorker;->K(Lca/a;I)V

    iget-boolean v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroidx/core/app/k$e;

    const-string v1, "FLUTTER_DOWNLOADER_NOTIFICATION"

    invoke-direct {v0, p1, v1}, Landroidx/core/app/k$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroidx/core/app/k$e;->t(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v0

    invoke-virtual {v0, p5}, Landroidx/core/app/k$e;->r(Landroid/app/PendingIntent;)Landroidx/core/app/k$e;

    move-result-object p5

    const/4 v0, 0x1

    invoke-virtual {p5, v0}, Landroidx/core/app/k$e;->G(Z)Landroidx/core/app/k$e;

    move-result-object p5

    invoke-virtual {p5, v0}, Landroidx/core/app/k$e;->m(Z)Landroidx/core/app/k$e;

    move-result-object p5

    const/4 v1, -0x1

    invoke-virtual {p5, v1}, Landroidx/core/app/k$e;->H(I)Landroidx/core/app/k$e;

    move-result-object p5

    const-string v1, "Builder(context, CHANNEL\u2026ationCompat.PRIORITY_LOW)"

    invoke-static {p5, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lvn/hunghd/flutterdownloader/DownloadWorker$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const v2, 0x1080082

    const/4 v3, 0x0

    if-eq v1, v0, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_3

    const/4 v0, 0x3

    if-eq v1, v0, :cond_2

    const/4 v0, 0x4

    if-eq v1, v0, :cond_1

    const/4 v0, 0x5

    if-eq v1, v0, :cond_0

    invoke-virtual {p5, v3, v3, v3}, Landroidx/core/app/k$e;->I(IIZ)Landroidx/core/app/k$e;

    :goto_0
    invoke-virtual {p5, v3}, Landroidx/core/app/k$e;->F(Z)Landroidx/core/app/k$e;

    move-result-object v0

    invoke-direct {p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->F()I

    move-result v1

    :goto_1
    invoke-virtual {v0, v1}, Landroidx/core/app/k$e;->L(I)Landroidx/core/app/k$e;

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Ljava/lang/String;

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/lang/String;

    :goto_2
    invoke-virtual {p5, v0}, Landroidx/core/app/k$e;->s(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v0

    invoke-virtual {v0, v3, v3, v3}, Landroidx/core/app/k$e;->I(IIZ)Landroidx/core/app/k$e;

    invoke-virtual {p5, v3}, Landroidx/core/app/k$e;->F(Z)Landroidx/core/app/k$e;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/core/app/k$e;->L(I)Landroidx/core/app/k$e;

    goto :goto_3

    :cond_4
    if-gtz p4, :cond_5

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:Ljava/lang/String;

    invoke-virtual {p5, v0}, Landroidx/core/app/k$e;->s(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v0

    invoke-virtual {v0, v3, v3, v3}, Landroidx/core/app/k$e;->I(IIZ)Landroidx/core/app/k$e;

    goto :goto_0

    :cond_5
    const/16 v1, 0x64

    if-ge p4, v1, :cond_0

    iget-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Ljava/lang/String;

    invoke-virtual {p5, v2}, Landroidx/core/app/k$e;->s(Ljava/lang/CharSequence;)Landroidx/core/app/k$e;

    move-result-object v2

    invoke-virtual {v2, v1, p4, v3}, Landroidx/core/app/k$e;->I(IIZ)Landroidx/core/app/k$e;

    invoke-virtual {p5, v0}, Landroidx/core/app/k$e;->F(Z)Landroidx/core/app/k$e;

    move-result-object v0

    const v1, 0x1080081

    goto :goto_1

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->L:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    if-eqz p6, :cond_6

    const-string p6, "Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed"

    invoke-direct {p0, p6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p6

    invoke-virtual {p6}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_4

    :cond_6
    const-string p1, "Update too frequently!!!!, this should be dropped"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    return-void

    :cond_7
    :goto_4
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Update notification: {notificationId: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:I

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", status: "

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", progress: "

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x7d

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/core/app/n;->f(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object p1

    iget p2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:I

    invoke-virtual {p5}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/core/app/n;->i(ILandroid/app/Notification;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->L:J

    :cond_8
    return-void
.end method

.method public static synthetic r(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->L(Lvn/hunghd/flutterdownloader/DownloadWorker;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->v(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic t(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    invoke-static {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->u(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result p0

    return p0
.end method

.method private static final u(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private static final v(Lvn/hunghd/flutterdownloader/DownloadWorker;Landroid/content/Context;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->P(Landroid/content/Context;)V

    return-void
.end method

.method private final w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    const-string v4, "image/"

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v3, v4, v5, v6, v7}, Lq9/d;->k(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    const-string v8, " to MediaStore"

    const-string v9, "insert "

    const-string v10, "_data"

    const-string v11, "datetaken"

    const-string v12, "date_added"

    const-string v13, "mime_type"

    const-string v14, ""

    const-string v15, "description"

    const-string v5, "_display_name"

    const-string v6, "title"

    if-eqz v4, :cond_0

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v4, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v4, v10, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v2, v4}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    goto :goto_0

    :cond_0
    const-string v4, "video"

    move-object/from16 v16, v8

    const/4 v0, 0x2

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v0, v7}, Lq9/d;->k(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v0, v6, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v0, v10, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v1, v3, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v0

    :goto_1
    return-void
.end method

.method private final x()V
    .locals 8

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id.toString()"

    invoke-static {v1, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lca/c;->l()Lca/a;

    move-result-object v1

    sget-object v2, Lca/a;->q:Lca/a;

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Lca/c;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lca/c;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lca/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lca/c;->o()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "/"

    invoke-static/range {v2 .. v7}, Lq9/d;->B(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0}, Lca/c;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v2}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lca/c;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    return-void
.end method

.method private final y(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const-string p1, "It looks like you are trying to save file in public storage but not setting \'saveInPublicStorage\' to \'true\'"

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->J(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    const-string p1, "Create a file using java.io API failed "

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->J(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final z(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    sget-object v0, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "EXTERNAL_CONTENT_URI"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "_display_name"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mime_type"

    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    const-string p2, "relative_path"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string p1, "Create a file using MediaStore API failed."

    invoke-direct {p0, p1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->J(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public l()V
    .locals 9

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    const-string v0, "applicationContext"

    invoke-static {v1, v0}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lca/k;->n:Lca/k$a;

    invoke-virtual {v0, v1}, Lca/k$a;->a(Landroid/content/Context;)Lca/k;

    move-result-object v0

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Lca/k;

    new-instance v2, Lca/j;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-direct {v2, v0}, Lca/j;-><init>(Lca/k;)V

    iput-object v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v0

    const-string v2, "url"

    invoke-virtual {v0, v2}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v2

    const-string v3, "file_name"

    invoke-virtual {v2, v3}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    const-string v7, "id.toString()"

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lca/c;->l()Lca/a;

    move-result-object v3

    sget-object v4, Lca/a;->o:Lca/a;

    if-ne v3, v4, :cond_3

    if-nez v2, :cond_1

    move-object v2, v0

    :cond_1
    sget-object v8, Lca/a;->s:Lca/a;

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v0, p0

    move-object v3, v8

    invoke-direct/range {v0 .. v6}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    invoke-virtual {v0, v1, v8, v2}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll8/j;->a:Ljava/lang/String;

    const-string v0, "didInitializeDispatcher"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter p1

    :goto_0
    :try_start_0
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->R:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lvn/hunghd/flutterdownloader/DownloadWorker;->w:Ll8/k;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, ""

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ll8/k$d;->a(Ljava/lang/Object;)V

    sget-object p2, Ly8/s;->a:Ly8/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    invoke-interface {p2}, Ll8/k$d;->c()V

    :goto_1
    return-void
.end method

.method public q()Landroidx/work/ListenableWorker$a;
    .locals 19

    move-object/from16 v9, p0

    sget-object v0, Lca/k;->n:Lca/k$a;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lca/k$a;->a(Landroid/content/Context;)Lca/k;

    move-result-object v0

    iput-object v0, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Lca/k;

    new-instance v1, Lca/j;

    invoke-static {v0}, Lk9/k;->b(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lca/j;-><init>(Lca/k;)V

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v0

    const-string v1, "file_name"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v0

    const-string v1, "saved_file"

    invoke-virtual {v0, v1}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "headers"

    invoke-virtual {v1, v2}, Landroidx/work/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "is_resume"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const/16 v2, 0x3a98

    const-string v4, "timeout"

    invoke-virtual {v1, v4, v2}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "debug"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->B:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const/16 v2, 0xa

    const-string v4, "step"

    invoke-virtual {v1, v4, v2}, Landroidx/work/b;->i(Ljava/lang/String;I)I

    move-result v1

    iput v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->M:I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "ignoreSsl"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->C:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lca/i;->h:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->F:Ljava/lang/String;

    sget v2, Lca/i;->f:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->G:Ljava/lang/String;

    sget v2, Lca/i;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->H:Ljava/lang/String;

    sget v2, Lca/i;->e:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->I:Ljava/lang/String;

    sget v2, Lca/i;->g:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->J:Ljava/lang/String;

    sget v2, Lca/i;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->K:Ljava/lang/String;

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    const-string v14, "id.toString()"

    if-nez v1, :cond_0

    const/16 v16, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lca/j;->d(Ljava/lang/String;)Lca/c;

    move-result-object v1

    move-object/from16 v16, v1

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DownloadWorker{url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",filename="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",savedDir="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",header="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",isResume="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "GONE"

    if-nez v16, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual/range {v16 .. v16}, Lca/c;->l()Lca/a;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    if-eqz v16, :cond_9

    invoke-virtual/range {v16 .. v16}, Lca/c;->l()Lca/a;

    move-result-object v1

    sget-object v2, Lca/a;->s:Lca/a;

    if-ne v1, v2, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "show_notification"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->z:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "open_file_from_notification"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->A:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "save_in_public_storage"

    invoke-virtual {v1, v2, v3}, Landroidx/work/b;->h(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->N:Z

    invoke-virtual/range {v16 .. v16}, Lca/c;->f()I

    move-result v1

    iput v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->E:I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v1

    const-string v7, "applicationContext"

    invoke-static {v1, v7}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v1}, Lvn/hunghd/flutterdownloader/DownloadWorker;->N(Landroid/content/Context;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v7}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v11, :cond_4

    move-object v3, v10

    goto :goto_2

    :cond_4
    move-object v3, v11

    :goto_2
    sget-object v6, Lca/a;->p:Lca/a;

    invoke-virtual/range {v16 .. v16}, Lca/c;->g()I

    move-result v5

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object v4, v6

    move-object v15, v6

    move-object/from16 v6, v17

    move/from16 v17, v12

    move-object v12, v7

    move/from16 v7, v18

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lca/c;->g()I

    move-result v3

    invoke-virtual {v1, v2, v15, v3}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exists file for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "automatic resuming..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v9, v2}, Lvn/hunghd/flutterdownloader/DownloadWorker;->I(Ljava/lang/String;)V

    move v7, v1

    goto :goto_4

    :cond_6
    move/from16 v7, v17

    :goto_4
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v12}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    move-object v3, v10

    move-object v4, v0

    move-object v5, v11

    move-object v6, v8

    move v8, v13

    invoke-direct/range {v1 .. v8}, Lvn/hunghd/flutterdownloader/DownloadWorker;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-direct/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/DownloadWorker;->x()V

    const/4 v1, 0x0

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Lca/k;

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {}, Landroidx/work/ListenableWorker$a;->c()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    const-string v1, "{\n            downloadFi\u2026esult.success()\n        }"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v12}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v11, :cond_7

    move-object v3, v10

    goto :goto_5

    :cond_7
    move-object v3, v11

    :goto_5
    sget-object v8, Lca/a;->r:Lca/a;

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object v4, v8

    invoke-direct/range {v1 .. v7}, Lvn/hunghd/flutterdownloader/DownloadWorker;->Q(Landroid/content/Context;Ljava/lang/String;Lca/a;ILandroid/app/PendingIntent;Z)V

    iget-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual/range {p0 .. p0}, Landroidx/work/ListenableWorker;->f()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->D:I

    invoke-virtual {v1, v2, v8, v3}, Lca/j;->g(Ljava/lang/String;Lca/a;I)V

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v1, 0x0

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->x:Lca/k;

    iput-object v1, v9, Lvn/hunghd/flutterdownloader/DownloadWorker;->y:Lca/j;

    invoke-static {}, Landroidx/work/ListenableWorker$a;->a()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    const-string v1, "{\n            updateNoti\u2026esult.failure()\n        }"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_7
    return-object v0

    :cond_9
    :goto_8
    invoke-static {}, Landroidx/work/ListenableWorker$a;->c()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    const-string v1, "success()"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'headers\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'saved_file\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument \'url\' should not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
