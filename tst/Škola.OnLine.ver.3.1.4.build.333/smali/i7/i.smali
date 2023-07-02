.class public Li7/i;
.super Li7/f;
.source ""


# instance fields
.field private final n:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Li7/f;-><init>(Ljava/lang/String;)V

    iput p1, p0, Li7/i;->n:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Li7/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p1, p0, Li7/i;->n:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li7/i;->n:I

    return v0
.end method
