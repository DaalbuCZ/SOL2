.class public final synthetic Lv5/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lv5/c0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lv5/c0;

    invoke-direct {v0}, Lv5/c0;-><init>()V

    sput-object v0, Lv5/c0;->n:Lv5/c0;

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

    check-cast p1, Lx5/b0$c;

    check-cast p2, Lx5/b0$c;

    invoke-static {p1, p2}, Lv5/e0;->b(Lx5/b0$c;Lx5/b0$c;)I

    move-result p1

    return p1
.end method
