.class final Ll1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj1/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj1/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ll1/p;

.field private final b:Ljava/lang/String;

.field private final c:Lj1/b;

.field private final d:Lj1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/e<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field private final e:Ll1/t;


# direct methods
.method constructor <init>(Ll1/p;Ljava/lang/String;Lj1/b;Lj1/e;Ll1/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/p;",
            "Ljava/lang/String;",
            "Lj1/b;",
            "Lj1/e<",
            "TT;[B>;",
            "Ll1/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s;->a:Ll1/p;

    iput-object p2, p0, Ll1/s;->b:Ljava/lang/String;

    iput-object p3, p0, Ll1/s;->c:Lj1/b;

    iput-object p4, p0, Ll1/s;->d:Lj1/e;

    iput-object p5, p0, Ll1/s;->e:Ll1/t;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Ll1/s;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lj1/c;Lj1/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/c<",
            "TT;>;",
            "Lj1/h;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ll1/s;->e:Ll1/t;

    invoke-static {}, Ll1/o;->a()Ll1/o$a;

    move-result-object v1

    iget-object v2, p0, Ll1/s;->a:Ll1/p;

    invoke-virtual {v1, v2}, Ll1/o$a;->e(Ll1/p;)Ll1/o$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll1/o$a;->c(Lj1/c;)Ll1/o$a;

    move-result-object p1

    iget-object v1, p0, Ll1/s;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll1/o$a;->f(Ljava/lang/String;)Ll1/o$a;

    move-result-object p1

    iget-object v1, p0, Ll1/s;->d:Lj1/e;

    invoke-virtual {p1, v1}, Ll1/o$a;->d(Lj1/e;)Ll1/o$a;

    move-result-object p1

    iget-object v1, p0, Ll1/s;->c:Lj1/b;

    invoke-virtual {p1, v1}, Ll1/o$a;->b(Lj1/b;)Ll1/o$a;

    move-result-object p1

    invoke-virtual {p1}, Ll1/o$a;->a()Ll1/o;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ll1/t;->a(Ll1/o;Lj1/h;)V

    return-void
.end method

.method public b(Lj1/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/c<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Ll1/r;->a:Ll1/r;

    invoke-virtual {p0, p1, v0}, Ll1/s;->a(Lj1/c;Lj1/h;)V

    return-void
.end method

.method d()Ll1/p;
    .locals 1

    iget-object v0, p0, Ll1/s;->a:Ll1/p;

    return-object v0
.end method
