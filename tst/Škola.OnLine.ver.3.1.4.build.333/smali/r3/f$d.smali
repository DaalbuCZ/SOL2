.class final Lr3/f$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lr3/f$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final n:I

.field public final o:Lr3/d;


# direct methods
.method public constructor <init>(ILr3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr3/f$d;->n:I

    iput-object p2, p0, Lr3/f$d;->o:Lr3/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lr3/f$d;

    invoke-virtual {p0, p1}, Lr3/f$d;->e(Lr3/f$d;)I

    move-result p1

    return p1
.end method

.method public e(Lr3/f$d;)I
    .locals 1

    iget v0, p0, Lr3/f$d;->n:I

    iget p1, p1, Lr3/f$d;->n:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
