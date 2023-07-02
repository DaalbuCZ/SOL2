.class public final synthetic Lr3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lr3/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/j;

    invoke-direct {v0}, Lr3/j;-><init>()V

    sput-object v0, Lr3/j;->n:Lr3/j;

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

    check-cast p1, Lr3/e;

    check-cast p2, Lr3/e;

    invoke-static {p1, p2}, Lr3/k;->a(Lr3/e;Lr3/e;)I

    move-result p1

    return p1
.end method
