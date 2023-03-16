.class public abstract Lb5/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/k$b;
    }
.end annotation


# static fields
.field private static final a:Lb5/k;

.field private static final b:Lb5/k;

.field private static final c:Lb5/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb5/k$a;

    invoke-direct {v0}, Lb5/k$a;-><init>()V

    sput-object v0, Lb5/k;->a:Lb5/k;

    new-instance v0, Lb5/k$b;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lb5/k$b;-><init>(I)V

    sput-object v0, Lb5/k;->b:Lb5/k;

    new-instance v0, Lb5/k$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb5/k$b;-><init>(I)V

    sput-object v0, Lb5/k;->c:Lb5/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb5/k$a;)V
    .locals 0

    invoke-direct {p0}, Lb5/k;-><init>()V

    return-void
.end method

.method static synthetic a()Lb5/k;
    .locals 1

    sget-object v0, Lb5/k;->b:Lb5/k;

    return-object v0
.end method

.method static synthetic b()Lb5/k;
    .locals 1

    sget-object v0, Lb5/k;->c:Lb5/k;

    return-object v0
.end method

.method static synthetic c()Lb5/k;
    .locals 1

    sget-object v0, Lb5/k;->a:Lb5/k;

    return-object v0
.end method

.method public static j()Lb5/k;
    .locals 1

    sget-object v0, Lb5/k;->a:Lb5/k;

    return-object v0
.end method


# virtual methods
.method public abstract d(II)Lb5/k;
.end method

.method public abstract e(JJ)Lb5/k;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lb5/k;"
        }
    .end annotation
.end method

.method public abstract g(ZZ)Lb5/k;
.end method

.method public abstract h(ZZ)Lb5/k;
.end method

.method public abstract i()I
.end method
