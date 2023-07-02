.class Lga/f$a;
.super Lga/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/f;->b(Lga/d;[BII)Lga/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:[B

.field final synthetic c:I


# direct methods
.method constructor <init>(Lga/d;I[BI)V
    .locals 0

    iput p2, p0, Lga/f$a;->a:I

    iput-object p3, p0, Lga/f$a;->b:[B

    iput p4, p0, Lga/f$a;->c:I

    invoke-direct {p0}, Lga/f;-><init>()V

    return-void
.end method
