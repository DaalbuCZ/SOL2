.class public final synthetic Lx1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/f;


# static fields
.field public static final synthetic n:Lx1/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/t;

    invoke-direct {v0}, Lx1/t;-><init>()V

    sput-object v0, Lx1/t;->n:Lx1/t;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Ly1/o1;

    check-cast p1, Lu3/d;

    invoke-direct {v0, p1}, Ly1/o1;-><init>(Lu3/d;)V

    return-object v0
.end method
