.class public final synthetic Ls3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Ls3/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/b;

    invoke-direct {v0}, Ls3/b;-><init>()V

    sput-object v0, Ls3/b;->n:Ls3/b;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lx1/n1;

    check-cast p2, Lx1/n1;

    invoke-static {p1, p2}, Ls3/c;->f(Lx1/n1;Lx1/n1;)I

    move-result p1

    return p1
.end method
