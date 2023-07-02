.class public abstract Lg5/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/k$b;
    }
.end annotation


# static fields
.field private static final a:Lg5/k;

.field private static final b:Lg5/k;

.field private static final c:Lg5/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg5/k$a;

    invoke-direct {v0}, Lg5/k$a;-><init>()V

    sput-object v0, Lg5/k;->a:Lg5/k;

    new-instance v0, Lg5/k$b;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lg5/k$b;-><init>(I)V

    sput-object v0, Lg5/k;->b:Lg5/k;

    new-instance v0, Lg5/k$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg5/k$b;-><init>(I)V

    sput-object v0, Lg5/k;->c:Lg5/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lg5/k$a;)V
    .locals 0

    invoke-direct {p0}, Lg5/k;-><init>()V

    return-void
.end method

.method static synthetic a()Lg5/k;
    .locals 1

    sget-object v0, Lg5/k;->b:Lg5/k;

    return-object v0
.end method

.method static synthetic b()Lg5/k;
    .locals 1

    sget-object v0, Lg5/k;->c:Lg5/k;

    return-object v0
.end method

.method static synthetic c()Lg5/k;
    .locals 1

    sget-object v0, Lg5/k;->a:Lg5/k;

    return-object v0
.end method

.method public static j()Lg5/k;
    .locals 1

    sget-object v0, Lg5/k;->a:Lg5/k;

    return-object v0
.end method


# virtual methods
.method public abstract d(II)Lg5/k;
.end method

.method public abstract e(JJ)Lg5/k;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lg5/k;"
        }
    .end annotation
.end method

.method public abstract g(ZZ)Lg5/k;
.end method

.method public abstract h(ZZ)Lg5/k;
.end method

.method public abstract i()I
.end method
