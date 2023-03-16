.class public final Ls0/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls0/n;


# instance fields
.field private final a:Landroidx/room/h;

.field private final b:Ly/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/a<",
            "Ls0/m;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ly/d;

.field private final d:Ly/d;


# direct methods
.method public constructor <init>(Landroidx/room/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/o;->a:Landroidx/room/h;

    new-instance v0, Ls0/o$a;

    invoke-direct {v0, p0, p1}, Ls0/o$a;-><init>(Ls0/o;Landroidx/room/h;)V

    iput-object v0, p0, Ls0/o;->b:Ly/a;

    new-instance v0, Ls0/o$b;

    invoke-direct {v0, p0, p1}, Ls0/o$b;-><init>(Ls0/o;Landroidx/room/h;)V

    iput-object v0, p0, Ls0/o;->c:Ly/d;

    new-instance v0, Ls0/o$c;

    invoke-direct {v0, p0, p1}, Ls0/o$c;-><init>(Ls0/o;Landroidx/room/h;)V

    iput-object v0, p0, Ls0/o;->d:Ly/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v0}, Landroidx/room/h;->b()V

    iget-object v0, p0, Ls0/o;->c:Ly/d;

    invoke-virtual {v0}, Ly/d;->a()Lb0/f;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lb0/d;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lb0/d;->n(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->c()V

    :try_start_0
    invoke-interface {v0}, Lb0/f;->q()I

    iget-object p1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {p1}, Landroidx/room/h;->g()V

    iget-object p1, p0, Ls0/o;->c:Ly/d;

    invoke-virtual {p1, v0}, Ly/d;->f(Lb0/f;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->g()V

    iget-object v1, p0, Ls0/o;->c:Ly/d;

    invoke-virtual {v1, v0}, Ly/d;->f(Lb0/f;)V

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v0}, Landroidx/room/h;->b()V

    iget-object v0, p0, Ls0/o;->d:Ly/d;

    invoke-virtual {v0}, Ly/d;->a()Lb0/f;

    move-result-object v0

    iget-object v1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->c()V

    :try_start_0
    invoke-interface {v0}, Lb0/f;->q()I

    iget-object v1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v1}, Landroidx/room/h;->g()V

    iget-object v1, p0, Ls0/o;->d:Ly/d;

    invoke-virtual {v1, v0}, Ly/d;->f(Lb0/f;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ls0/o;->a:Landroidx/room/h;

    invoke-virtual {v2}, Landroidx/room/h;->g()V

    iget-object v2, p0, Ls0/o;->d:Ly/d;

    invoke-virtual {v2, v0}, Ly/d;->f(Lb0/f;)V

    throw v1
.end method
