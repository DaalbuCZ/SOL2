.class final Lv9/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb9/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lv9/b;

.field private static final o:Lb9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/b;

    invoke-direct {v0}, Lv9/b;-><init>()V

    sput-object v0, Lv9/b;->n:Lv9/b;

    sget-object v0, Lb9/h;->n:Lb9/h;

    sput-object v0, Lv9/b;->o:Lb9/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lb9/g;
    .locals 1

    sget-object v0, Lv9/b;->o:Lb9/g;

    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
