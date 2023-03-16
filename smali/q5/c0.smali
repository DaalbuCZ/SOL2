.class public final synthetic Lq5/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lq5/c0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lq5/c0;

    invoke-direct {v0}, Lq5/c0;-><init>()V

    sput-object v0, Lq5/c0;->n:Lq5/c0;

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

    check-cast p1, Ls5/b0$c;

    check-cast p2, Ls5/b0$c;

    invoke-static {p1, p2}, Lq5/e0;->b(Ls5/b0$c;Ls5/b0$c;)I

    move-result p1

    return p1
.end method
