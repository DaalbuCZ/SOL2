.class final Lda/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj9/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lda/b;

.field private static final o:Lj9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/b;

    invoke-direct {v0}, Lda/b;-><init>()V

    sput-object v0, Lda/b;->n:Lda/b;

    sget-object v0, Lj9/h;->n:Lj9/h;

    sput-object v0, Lda/b;->o:Lj9/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lj9/g;
    .locals 1

    sget-object v0, Lda/b;->o:Lj9/g;

    return-object v0
.end method

.method public k(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
