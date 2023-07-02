.class public final synthetic Lv2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lv2/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/d;

    invoke-direct {v0}, Lv2/d;-><init>()V

    sput-object v0, Lv2/d;->n:Lv2/d;

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

    check-cast p1, Lv2/c$b;

    check-cast p2, Lv2/c$b;

    invoke-static {p1, p2}, Lv2/c$b;->a(Lv2/c$b;Lv2/c$b;)I

    move-result p1

    return p1
.end method
