.class public final synthetic Lk2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/f;


# static fields
.field public static final synthetic n:Lk2/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk2/j;

    invoke-direct {v0}, Lk2/j;-><init>()V

    sput-object v0, Lk2/j;->n:Lk2/j;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk2/o;

    invoke-static {p1}, Lk2/k;->k(Lk2/o;)Lk2/o;

    move-result-object p1

    return-object p1
.end method
