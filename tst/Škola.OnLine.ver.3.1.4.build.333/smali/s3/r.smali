.class public final synthetic Ls3/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Ls3/r;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/r;

    invoke-direct {v0}, Ls3/r;-><init>()V

    sput-object v0, Ls3/r;->n:Ls3/r;

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

    invoke-static {p1, p2}, Ls3/m$i;->j(Ls3/m$i;Ls3/m$i;)I

    move-result p1

    return p1
.end method
