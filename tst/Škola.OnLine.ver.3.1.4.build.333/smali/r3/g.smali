.class public final synthetic Lr3/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lr3/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/g;

    invoke-direct {v0}, Lr3/g;-><init>()V

    sput-object v0, Lr3/g;->n:Lr3/g;

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

    check-cast p1, Lr3/f$b;

    check-cast p2, Lr3/f$b;

    invoke-static {p1, p2}, Lr3/f$b;->a(Lr3/f$b;Lr3/f$b;)I

    move-result p1

    return p1
.end method
