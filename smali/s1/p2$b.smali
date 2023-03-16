.class public final Ls1/p2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/p2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/p2$b$a;
    }
.end annotation


# static fields
.field public static final o:Ls1/p2$b;

.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/p2$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lp3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/p2$b$a;

    invoke-direct {v0}, Ls1/p2$b$a;-><init>()V

    invoke-virtual {v0}, Ls1/p2$b$a;->e()Ls1/p2$b;

    move-result-object v0

    sput-object v0, Ls1/p2$b;->o:Ls1/p2$b;

    sget-object v0, Ls1/q2;->a:Ls1/q2;

    sput-object v0, Ls1/p2$b;->p:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Lp3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/p2$b;->n:Lp3/l;

    return-void
.end method

.method synthetic constructor <init>(Lp3/l;Ls1/p2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/p2$b;-><init>(Lp3/l;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/p2$b;
    .locals 0

    invoke-static {p0}, Ls1/p2$b;->c(Landroid/os/Bundle;)Ls1/p2$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Ls1/p2$b;)Lp3/l;
    .locals 0

    iget-object p0, p0, Ls1/p2$b;->n:Lp3/l;

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ls1/p2$b;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/p2$b;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Ls1/p2$b;->o:Ls1/p2$b;

    return-object p0

    :cond_0
    new-instance v1, Ls1/p2$b$a;

    invoke-direct {v1}, Ls1/p2$b$a;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/p2$b$a;->a(I)Ls1/p2$b$a;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ls1/p2$b$a;->e()Ls1/p2$b;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ls1/p2$b;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ls1/p2$b;

    iget-object v0, p0, Ls1/p2$b;->n:Lp3/l;

    iget-object p1, p1, Ls1/p2$b;->n:Lp3/l;

    invoke-virtual {v0, p1}, Lp3/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls1/p2$b;->n:Lp3/l;

    invoke-virtual {v0}, Lp3/l;->hashCode()I

    move-result v0

    return v0
.end method
