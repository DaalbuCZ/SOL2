.class Landroidx/work/impl/WorkDatabase$b;
.super Landroidx/room/h$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->u()Landroidx/room/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lg0/b;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/room/h$b;->c(Lg0/b;)V

    invoke-interface {p1}, Lg0/b;->h()V

    :try_start_0
    invoke-static {}, Landroidx/work/impl/WorkDatabase;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lg0/b;->q(Ljava/lang/String;)V

    invoke-interface {p1}, Lg0/b;->J()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lg0/b;->g()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lg0/b;->g()V

    throw v0
.end method
