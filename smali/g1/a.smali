.class public final Lg1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/a$f;,
        Lg1/a$b;,
        Lg1/a$c;,
        Lg1/a$d;,
        Lg1/a$g;,
        Lg1/a$a;,
        Lg1/a$e;
    }
.end annotation


# static fields
.field public static final a:Lc6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/a;

    invoke-direct {v0}, Lg1/a;-><init>()V

    sput-object v0, Lg1/a;->a:Lc6/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc6/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/b<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Lg1/m;

    sget-object v1, Lg1/a$e;->a:Lg1/a$e;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/a;

    sget-object v1, Lg1/a$a;->a:Lg1/a$a;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/f;

    sget-object v1, Lg1/a$g;->a:Lg1/a$g;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/d;

    sget-object v1, Lg1/a$d;->a:Lg1/a$d;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/c;

    sget-object v1, Lg1/a$c;->a:Lg1/a$c;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/b;

    sget-object v1, Lg1/a$b;->a:Lg1/a$b;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    const-class v0, Lj1/e;

    sget-object v1, Lg1/a$f;->a:Lg1/a$f;

    invoke-interface {p1, v0, v1}, Lc6/b;->a(Ljava/lang/Class;Lb6/d;)Lc6/b;

    return-void
.end method
