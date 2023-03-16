.class final Lg1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le1/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le1/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lg1/p;

.field private final b:Ljava/lang/String;

.field private final c:Le1/b;

.field private final d:Le1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le1/e<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field private final e:Lg1/t;


# direct methods
.method constructor <init>(Lg1/p;Ljava/lang/String;Le1/b;Le1/e;Lg1/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/p;",
            "Ljava/lang/String;",
            "Le1/b;",
            "Le1/e<",
            "TT;[B>;",
            "Lg1/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/s;->a:Lg1/p;

    iput-object p2, p0, Lg1/s;->b:Ljava/lang/String;

    iput-object p3, p0, Lg1/s;->c:Le1/b;

    iput-object p4, p0, Lg1/s;->d:Le1/e;

    iput-object p5, p0, Lg1/s;->e:Lg1/t;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0}, Lg1/s;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Le1/c;Le1/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/c<",
            "TT;>;",
            "Le1/h;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lg1/s;->e:Lg1/t;

    invoke-static {}, Lg1/o;->a()Lg1/o$a;

    move-result-object v1

    iget-object v2, p0, Lg1/s;->a:Lg1/p;

    invoke-virtual {v1, v2}, Lg1/o$a;->e(Lg1/p;)Lg1/o$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lg1/o$a;->c(Le1/c;)Lg1/o$a;

    move-result-object p1

    iget-object v1, p0, Lg1/s;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lg1/o$a;->f(Ljava/lang/String;)Lg1/o$a;

    move-result-object p1

    iget-object v1, p0, Lg1/s;->d:Le1/e;

    invoke-virtual {p1, v1}, Lg1/o$a;->d(Le1/e;)Lg1/o$a;

    move-result-object p1

    iget-object v1, p0, Lg1/s;->c:Le1/b;

    invoke-virtual {p1, v1}, Lg1/o$a;->b(Le1/b;)Lg1/o$a;

    move-result-object p1

    invoke-virtual {p1}, Lg1/o$a;->a()Lg1/o;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lg1/t;->a(Lg1/o;Le1/h;)V

    return-void
.end method

.method public b(Le1/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/c<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Lg1/r;->a:Lg1/r;

    invoke-virtual {p0, p1, v0}, Lg1/s;->a(Le1/c;Le1/h;)V

    return-void
.end method

.method d()Lg1/p;
    .locals 1

    iget-object v0, p0, Lg1/s;->a:Lg1/p;

    return-object v0
.end method
