.class public final Lx0/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx0/n;


# instance fields
.field private final a:Landroidx/room/h;

.field private final b:Lc0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a<",
            "Lx0/m;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc0/d;

.field private final d:Lc0/d;


# direct methods
.method public constructor <init>(Landroidx/room/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/o;->a:Landroidx/room/h;

    new-instance v0, Lx0/o$a;

    invoke-direct {v0, p0, p1}, Lx0/o$a;-><init>(Lx0/o;Landroidx/room/h;)V

    iput-object v0, p0, Lx0/o;->b:Lc0/a;

    new-instance v0, Lx0/o$b;

    invoke-direct {v0, p0, p1}, Lx0/o$b;-><init>(Lx0/o;Landroidx/room/h;)V

    iput-object v0, p0, Lx0/o;->c:Lc0/d;

    new-instance v0, Lx0/o$c;

    invoke-direct {v0, p0, p1}, Lx0/o$c;-><init>(Lx0/o;Landroidx/room/h;)V

    iput-object v0, p0, Lx0/o;->d:Lc0/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v0}, Landroidx/room/h;->b()V

    iget-object v0, p0, Lx0/o;->c:Lc0/d;

    invoke-virtual {v0}, Lc0/d;->a()Lg0/f;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lg0/d;->z(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lg0/d;->s(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->c()V

    :try_start_0
    invoke-interface {v0}, Lg0/f;->t()I

    iget-object p1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->g()V

    iget-object p1, p0, Lx0/o;->c:Lc0/d;

    invoke-virtual {p1, v0}, Lc0/d;->f(Lg0/f;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->g()V

    iget-object v1, p0, Lx0/o;->c:Lc0/d;

    invoke-virtual {v1, v0}, Lc0/d;->f(Lg0/f;)V

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v0}, Landroidx/room/h;->b()V

    iget-object v0, p0, Lx0/o;->d:Lc0/d;

    invoke-virtual {v0}, Lc0/d;->a()Lg0/f;

    move-result-object v0

    iget-object v1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->c()V

    :try_start_0
    invoke-interface {v0}, Lg0/f;->t()I

    iget-object v1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->g()V

    iget-object v1, p0, Lx0/o;->d:Lc0/d;

    invoke-virtual {v1, v0}, Lc0/d;->f(Lg0/f;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lx0/o;->a:Landroidx/room/h;

    invoke-virtual {v2}, Landroidx/room/h;->g()V

    iget-object v2, p0, Lx0/o;->d:Lc0/d;

    invoke-virtual {v2, v0}, Lc0/d;->f(Lg0/f;)V

    throw v1
.end method
