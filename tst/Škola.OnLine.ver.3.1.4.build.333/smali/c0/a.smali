.class public abstract Lc0/a;
.super Lc0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc0/d;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroidx/room/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lc0/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method protected abstract g(Lg0/f;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/f;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lc0/d;->a()Lg0/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lc0/a;->g(Lg0/f;Ljava/lang/Object;)V

    invoke-interface {v0}, Lg0/f;->S()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lc0/d;->f(Lg0/f;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lc0/d;->f(Lg0/f;)V

    throw p1
.end method
