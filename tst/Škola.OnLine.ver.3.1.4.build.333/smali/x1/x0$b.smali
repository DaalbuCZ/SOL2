.class final Lx1/x0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lx1/x0;Z)Ly1/t1;
    .locals 0

    invoke-static {p0}, Ly1/r1;->A0(Landroid/content/Context;)Ly1/r1;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "ExoPlayerImpl"

    const-string p1, "MediaMetricsService unavailable."

    invoke-static {p0, p1}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ly1/t1;

    sget-object p1, Landroid/media/metrics/LogSessionId;->LOG_SESSION_ID_NONE:Landroid/media/metrics/LogSessionId;

    invoke-direct {p0, p1}, Ly1/t1;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1, p0}, Lx1/x0;->O0(Ly1/c;)V

    :cond_1
    new-instance p1, Ly1/t1;

    invoke-virtual {p0}, Ly1/r1;->H0()Landroid/media/metrics/LogSessionId;

    move-result-object p0

    invoke-direct {p1, p0}, Ly1/t1;-><init>(Landroid/media/metrics/LogSessionId;)V

    return-object p1
.end method
