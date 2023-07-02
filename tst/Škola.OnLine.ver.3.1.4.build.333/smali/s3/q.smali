.class public final synthetic Ls3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Ls3/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/q;

    invoke-direct {v0}, Ls3/q;-><init>()V

    sput-object v0, Ls3/q;->n:Ls3/q;

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

    check-cast p1, Ls3/m$i;

    check-cast p2, Ls3/m$i;

    invoke-static {p1, p2}, Ls3/m$i;->h(Ls3/m$i;Ls3/m$i;)I

    move-result p1

    return p1
.end method
