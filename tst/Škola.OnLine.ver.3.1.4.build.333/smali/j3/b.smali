.class public final synthetic Lj3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic n:Lj3/b;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/b;

    invoke-direct {v0}, Lj3/b;-><init>()V

    sput-object v0, Lj3/b;->n:Lj3/b;

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

    check-cast p1, Lj3/c$a;

    check-cast p2, Lj3/c$a;

    invoke-static {p1, p2}, Lj3/c$a;->a(Lj3/c$a;Lj3/c$a;)I

    move-result p1

    return p1
.end method
