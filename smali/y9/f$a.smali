.class Ly9/f$a;
.super Ly9/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/f;->b(Ly9/d;[BII)Ly9/f;
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
.method constructor <init>(Ly9/d;I[BI)V
    .locals 0

    iput p2, p0, Ly9/f$a;->a:I

    iput-object p3, p0, Ly9/f$a;->b:[B

    iput p4, p0, Ly9/f$a;->c:I

    invoke-direct {p0}, Ly9/f;-><init>()V

    return-void
.end method
