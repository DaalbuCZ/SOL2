.class public final Lu7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Lt8/k$c;


# instance fields
.field private n:Lt8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt8/k;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    const-string v1, "android_path_provider"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lu7/a;->n:Lt8/k;

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lu7/a;->n:Lt8/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Ls9/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getAlarmsPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Landroid/os/Environment;->DIRECTORY_ALARMS:Ljava/lang/String;

    :goto_0
    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getDCIMPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DCIM:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getDocumentsPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getDownloadsPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getMoviesPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getMusicPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    goto :goto_0

    :cond_5
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getNotificationsPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Landroid/os/Environment;->DIRECTORY_NOTIFICATIONS:Ljava/lang/String;

    goto :goto_0

    :cond_6
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getPicturesPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    goto :goto_0

    :cond_7
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v1, "getPodcastsPath"

    invoke-static {v0, v1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Landroid/os/Environment;->DIRECTORY_PODCASTS:Ljava/lang/String;

    goto :goto_0

    :cond_8
    iget-object p1, p1, Lt8/j;->a:Ljava/lang/String;

    const-string v0, "getRingtonesPath"

    invoke-static {p1, v0}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Landroid/os/Environment;->DIRECTORY_RINGTONES:Ljava/lang/String;

    goto/16 :goto_0

    :cond_9
    invoke-interface {p2}, Lt8/k$d;->c()V

    :goto_1
    return-void
.end method
